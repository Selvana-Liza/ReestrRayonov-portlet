package com.liferay.reestrRayonov.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Rayon. This utility wraps
 * {@link com.liferay.reestrRayonov.service.impl.RayonLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liza
 * @see RayonLocalService
 * @see com.liferay.reestrRayonov.service.base.RayonLocalServiceBaseImpl
 * @see com.liferay.reestrRayonov.service.impl.RayonLocalServiceImpl
 * @generated
 */
public class RayonLocalServiceUtil {
    private static RayonLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.reestrRayonov.service.impl.RayonLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the rayon to the database. Also notifies the appropriate model listeners.
    *
    * @param rayon the rayon
    * @return the rayon that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon addRayon(
        com.liferay.reestrRayonov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRayon(rayon);
    }

    /**
    * Creates a new rayon with the primary key. Does not add the rayon to the database.
    *
    * @param rayonId the primary key for the new rayon
    * @return the new rayon
    */
    public static com.liferay.reestrRayonov.model.Rayon createRayon(
        long rayonId) {
        return getService().createRayon(rayonId);
    }

    /**
    * Deletes the rayon with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon that was removed
    * @throws PortalException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon deleteRayon(
        long rayonId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRayon(rayonId);
    }

    /**
    * Deletes the rayon from the database. Also notifies the appropriate model listeners.
    *
    * @param rayon the rayon
    * @return the rayon that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon deleteRayon(
        com.liferay.reestrRayonov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRayon(rayon);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.liferay.reestrRayonov.model.Rayon fetchRayon(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRayon(rayonId);
    }

    /**
    * Returns the rayon with the primary key.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon
    * @throws PortalException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon getRayon(long rayonId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayon(rayonId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the rayons.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> getRayons(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayons(start, end);
    }

    /**
    * Returns the number of rayons.
    *
    * @return the number of rayons
    * @throws SystemException if a system exception occurred
    */
    public static int getRayonsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayonsCount();
    }

    /**
    * Updates the rayon in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rayon the rayon
    * @return the rayon that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon updateRayon(
        com.liferay.reestrRayonov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRayon(rayon);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.reestrRayonov.model.Rayon addRayon(
        java.lang.String name, int kod, boolean archive)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addRayon(name, kod, archive);
    }

    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> getRayons(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayons(rayonId);
    }

    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> getRayons(
        long rayonId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayons(rayonId, start, end);
    }

    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> getRayons(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayons(archive);
    }

    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> getRayons(
        int kod) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayons(kod);
    }

    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> getRayons(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRayons(name);
    }

    public static com.liferay.reestrRayonov.model.Rayon updateRayon(
        long rayonId, java.lang.String name, int kod, boolean archive)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRayon(rayonId, name, kod, archive);
    }

    public static void clearService() {
        _service = null;
    }

    public static RayonLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RayonLocalService.class.getName());

            if (invokableLocalService instanceof RayonLocalService) {
                _service = (RayonLocalService) invokableLocalService;
            } else {
                _service = new RayonLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RayonLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RayonLocalService service) {
    }
}
