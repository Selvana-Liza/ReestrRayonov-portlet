package com.liferay.reestrRayonov.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.reestrRayonov.model.Rayon;
import com.liferay.reestrRayonov.service.RayonLocalServiceUtil;

/**
 * @author liza
 * @generated
 */
public abstract class RayonActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RayonActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RayonLocalServiceUtil.getService());
        setClass(Rayon.class);

        setClassLoader(com.liferay.reestrRayonov.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("rayonId");
    }
}
