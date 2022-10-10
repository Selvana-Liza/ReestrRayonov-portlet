package com.liferay.reestrRayonov.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RayonService}.
 *
 * @author liza
 * @see RayonService
 * @generated
 */
public class RayonServiceWrapper implements RayonService,
    ServiceWrapper<RayonService> {
    private RayonService _rayonService;

    public RayonServiceWrapper(RayonService rayonService) {
        _rayonService = rayonService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rayonService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rayonService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rayonService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RayonService getWrappedRayonService() {
        return _rayonService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRayonService(RayonService rayonService) {
        _rayonService = rayonService;
    }

    @Override
    public RayonService getWrappedService() {
        return _rayonService;
    }

    @Override
    public void setWrappedService(RayonService rayonService) {
        _rayonService = rayonService;
    }
}
