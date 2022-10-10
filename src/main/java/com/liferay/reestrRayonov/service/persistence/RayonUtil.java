package com.liferay.reestrRayonov.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.reestrRayonov.model.Rayon;

import java.util.List;

/**
 * The persistence utility for the rayon service. This utility wraps {@link RayonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liza
 * @see RayonPersistence
 * @see RayonPersistenceImpl
 * @generated
 */
public class RayonUtil {
    private static RayonPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Rayon rayon) {
        getPersistence().clearCache(rayon);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Rayon> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Rayon> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Rayon> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Rayon update(Rayon rayon) throws SystemException {
        return getPersistence().update(rayon);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Rayon update(Rayon rayon, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(rayon, serviceContext);
    }

    /**
    * Returns all the rayons where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByrayonId(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByrayonId(rayonId);
    }

    /**
    * Returns a range of all the rayons where rayonId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rayonId the rayon ID
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByrayonId(
        long rayonId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByrayonId(rayonId, start, end);
    }

    /**
    * Returns an ordered range of all the rayons where rayonId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rayonId the rayon ID
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByrayonId(
        long rayonId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByrayonId(rayonId, start, end, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByrayonId_First(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByrayonId_First(rayonId, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByrayonId_First(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByrayonId_First(rayonId, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByrayonId_Last(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByrayonId_Last(rayonId, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByrayonId_Last(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByrayonId_Last(rayonId, orderByComparator);
    }

    /**
    * Removes all the rayons where rayonId = &#63; from the database.
    *
    * @param rayonId the rayon ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByrayonId(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByrayonId(rayonId);
    }

    /**
    * Returns the number of rayons where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static int countByrayonId(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByrayonId(rayonId);
    }

    /**
    * Returns all the rayons where name = &#63;.
    *
    * @param name the name
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name);
    }

    /**
    * Returns a range of all the rayons where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end);
    }

    /**
    * Returns an ordered range of all the rayons where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByName_First(name, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_First(name, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByName_Last(name, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_Last(name, orderByComparator);
    }

    /**
    * Returns the rayons before and after the current rayon in the ordered set where name = &#63;.
    *
    * @param rayonId the primary key of the current rayon
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon[] findByName_PrevAndNext(
        long rayonId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence()
                   .findByName_PrevAndNext(rayonId, name, orderByComparator);
    }

    /**
    * Removes all the rayons where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByName(name);
    }

    /**
    * Returns the number of rayons where name = &#63;.
    *
    * @param name the name
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByName(name);
    }

    /**
    * Returns all the rayons where kod = &#63;.
    *
    * @param kod the kod
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByKod(
        int kod) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByKod(kod);
    }

    /**
    * Returns a range of all the rayons where kod = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param kod the kod
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByKod(
        int kod, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByKod(kod, start, end);
    }

    /**
    * Returns an ordered range of all the rayons where kod = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param kod the kod
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByKod(
        int kod, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByKod(kod, start, end, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByKod_First(
        int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByKod_First(kod, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByKod_First(
        int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByKod_First(kod, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByKod_Last(
        int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByKod_Last(kod, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByKod_Last(
        int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByKod_Last(kod, orderByComparator);
    }

    /**
    * Returns the rayons before and after the current rayon in the ordered set where kod = &#63;.
    *
    * @param rayonId the primary key of the current rayon
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon[] findByKod_PrevAndNext(
        long rayonId, int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence()
                   .findByKod_PrevAndNext(rayonId, kod, orderByComparator);
    }

    /**
    * Removes all the rayons where kod = &#63; from the database.
    *
    * @param kod the kod
    * @throws SystemException if a system exception occurred
    */
    public static void removeByKod(int kod)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByKod(kod);
    }

    /**
    * Returns the number of rayons where kod = &#63;.
    *
    * @param kod the kod
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static int countByKod(int kod)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByKod(kod);
    }

    /**
    * Returns all the rayons where archive = &#63;.
    *
    * @param archive the archive
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByArchive(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive(archive);
    }

    /**
    * Returns a range of all the rayons where archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @return the range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive(archive, start, end);
    }

    /**
    * Returns an ordered range of all the rayons where archive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive the archive
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findByArchive(
        boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchive(archive, start, end, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByArchive_First(archive, orderByComparator);
    }

    /**
    * Returns the first rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByArchive_First(archive, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByArchive_Last(archive, orderByComparator);
    }

    /**
    * Returns the last rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByArchive_Last(archive, orderByComparator);
    }

    /**
    * Returns the rayons before and after the current rayon in the ordered set where archive = &#63;.
    *
    * @param rayonId the primary key of the current rayon
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon[] findByArchive_PrevAndNext(
        long rayonId, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence()
                   .findByArchive_PrevAndNext(rayonId, archive,
            orderByComparator);
    }

    /**
    * Removes all the rayons where archive = &#63; from the database.
    *
    * @param archive the archive
    * @throws SystemException if a system exception occurred
    */
    public static void removeByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByArchive(archive);
    }

    /**
    * Returns the number of rayons where archive = &#63;.
    *
    * @param archive the archive
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchive(archive);
    }

    /**
    * Caches the rayon in the entity cache if it is enabled.
    *
    * @param rayon the rayon
    */
    public static void cacheResult(com.liferay.reestrRayonov.model.Rayon rayon) {
        getPersistence().cacheResult(rayon);
    }

    /**
    * Caches the rayons in the entity cache if it is enabled.
    *
    * @param rayons the rayons
    */
    public static void cacheResult(
        java.util.List<com.liferay.reestrRayonov.model.Rayon> rayons) {
        getPersistence().cacheResult(rayons);
    }

    /**
    * Creates a new rayon with the primary key. Does not add the rayon to the database.
    *
    * @param rayonId the primary key for the new rayon
    * @return the new rayon
    */
    public static com.liferay.reestrRayonov.model.Rayon create(long rayonId) {
        return getPersistence().create(rayonId);
    }

    /**
    * Removes the rayon with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon that was removed
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon remove(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().remove(rayonId);
    }

    public static com.liferay.reestrRayonov.model.Rayon updateImpl(
        com.liferay.reestrRayonov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(rayon);
    }

    /**
    * Returns the rayon with the primary key or throws a {@link com.liferay.reestrRayonov.NoSuchRayonException} if it could not be found.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon findByPrimaryKey(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException {
        return getPersistence().findByPrimaryKey(rayonId);
    }

    /**
    * Returns the rayon with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon, or <code>null</code> if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.reestrRayonov.model.Rayon fetchByPrimaryKey(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(rayonId);
    }

    /**
    * Returns all the rayons.
    *
    * @return the rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the rayons.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.reestrRayonov.model.impl.RayonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rayons
    * @param end the upper bound of the range of rayons (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rayons
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.reestrRayonov.model.Rayon> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the rayons from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of rayons.
    *
    * @return the number of rayons
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RayonPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RayonPersistence) PortletBeanLocatorUtil.locate(com.liferay.reestrRayonov.service.ClpSerializer.getServletContextName(),
                    RayonPersistence.class.getName());

            ReferenceRegistry.registerReference(RayonUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RayonPersistence persistence) {
    }
}
