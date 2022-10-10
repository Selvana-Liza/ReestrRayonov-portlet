package com.liferay.reestrRayonov.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.reestrRayonov.RayonNameException;
import com.liferay.reestrRayonov.model.Rayon;
import com.liferay.reestrRayonov.service.base.RayonLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the rayon local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.reestrRayonov.service.RayonLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liza
 * @see com.liferay.reestrRayonov.service.base.RayonLocalServiceBaseImpl
 * @see com.liferay.reestrRayonov.service.RayonLocalServiceUtil
 */
public class RayonLocalServiceImpl extends RayonLocalServiceBaseImpl {
    public Rayon addRayon(String name, int kod, boolean archive) throws PortalException, SystemException {
        long rayonId = CounterLocalServiceUtil.increment(Rayon.class.getName());

        validate(name);

        Rayon rayon = rayonPersistence.create(rayonId);

        rayon.setName(name);
        rayon.setKod(kod);
        rayon.setArchive(archive);

        rayonPersistence.update(rayon);
        return rayon;
    }

    public List<Rayon> getRayons(long rayonId) throws SystemException {
        return rayonPersistence.findByrayonId(rayonId);
    }

    public List<Rayon> getRayons(long rayonId, int start, int end) throws SystemException {
        return rayonPersistence.findByrayonId(rayonId, start, end);
    }

    public List<Rayon> getRayons(int start, int end) throws SystemException {
        return rayonPersistence.findAll(start,end);
    }

    public List<Rayon> getRayons(boolean archive) throws SystemException {
        return rayonPersistence.findByArchive(archive);
    }

    public List<Rayon> getRayons(int kod) throws SystemException {
        return rayonPersistence.findByKod(kod);
    }

    public List<Rayon> getRayons(String name) throws SystemException {
        return rayonPersistence.findByName(name);
    }

    public int getRayonsCount() throws SystemException {
        return rayonPersistence.countAll();
    }

    protected void validate(String name) throws PortalException {
        if (Validator.isNull(name)) {
            throw new RayonNameException();
        }
    }

    public Rayon updateRayon(long rayonId, String name,int kod, boolean archive) throws PortalException, SystemException {
        validate(name);

        Rayon rayon =rayonPersistence.findByPrimaryKey(rayonId);

        rayon.setName(name);
        rayon.setKod(kod);
        rayon.setArchive(archive);

        rayonPersistence.update(rayon);
        return rayon;
    }

    public Rayon deleteRayon(Rayon rayon) throws SystemException {
        rayonPersistence.remove(rayon);
        return rayon;
    }

    public Rayon deleteRayon(long rayonId) throws PortalException, SystemException {
        Rayon rayon = rayonPersistence.findByPrimaryKey(rayonId);
        return deleteRayon(rayon);
    }
}
