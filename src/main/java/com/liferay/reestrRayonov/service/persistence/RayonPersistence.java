package com.liferay.reestrRayonov.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.reestrRayonov.model.Rayon;

/**
 * The persistence interface for the rayon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liza
 * @see RayonPersistenceImpl
 * @see RayonUtil
 * @generated
 */
public interface RayonPersistence extends BasePersistence<Rayon> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RayonUtil} to access the rayon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the rayons where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByrayonId(
        long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByrayonId(
        long rayonId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByrayonId(
        long rayonId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByrayonId_First(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the first rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByrayonId_First(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByrayonId_Last(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the last rayon in the ordered set where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByrayonId_Last(
        long rayonId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rayons where rayonId = &#63; from the database.
    *
    * @param rayonId the rayon ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByrayonId(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons where rayonId = &#63;.
    *
    * @param rayonId the rayon ID
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public int countByrayonId(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons where name = &#63;.
    *
    * @param name the name
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the first rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the last rayon in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.reestrRayonov.model.Rayon[] findByName_PrevAndNext(
        long rayonId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Removes all the rayons where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons where name = &#63;.
    *
    * @param name the name
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons where kod = &#63;.
    *
    * @param kod the kod
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByKod(
        int kod) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByKod(
        int kod, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByKod(
        int kod, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByKod_First(int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the first rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByKod_First(int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByKod_Last(int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the last rayon in the ordered set where kod = &#63;.
    *
    * @param kod the kod
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByKod_Last(int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.reestrRayonov.model.Rayon[] findByKod_PrevAndNext(
        long rayonId, int kod,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Removes all the rayons where kod = &#63; from the database.
    *
    * @param kod the kod
    * @throws SystemException if a system exception occurred
    */
    public void removeByKod(int kod)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons where kod = &#63;.
    *
    * @param kod the kod
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public int countByKod(int kod)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons where archive = &#63;.
    *
    * @param archive the archive
    * @return the matching rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByArchive(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findByArchive(
        boolean archive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the first rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByArchive_First(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the last rayon in the ordered set where archive = &#63;.
    *
    * @param archive the archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByArchive_Last(
        boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.reestrRayonov.model.Rayon[] findByArchive_PrevAndNext(
        long rayonId, boolean archive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Removes all the rayons where archive = &#63; from the database.
    *
    * @param archive the archive
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons where archive = &#63;.
    *
    * @param archive the archive
    * @return the number of matching rayons
    * @throws SystemException if a system exception occurred
    */
    public int countByArchive(boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the rayon in the entity cache if it is enabled.
    *
    * @param rayon the rayon
    */
    public void cacheResult(com.liferay.reestrRayonov.model.Rayon rayon);

    /**
    * Caches the rayons in the entity cache if it is enabled.
    *
    * @param rayons the rayons
    */
    public void cacheResult(
        java.util.List<com.liferay.reestrRayonov.model.Rayon> rayons);

    /**
    * Creates a new rayon with the primary key. Does not add the rayon to the database.
    *
    * @param rayonId the primary key for the new rayon
    * @return the new rayon
    */
    public com.liferay.reestrRayonov.model.Rayon create(long rayonId);

    /**
    * Removes the rayon with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon that was removed
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon remove(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    public com.liferay.reestrRayonov.model.Rayon updateImpl(
        com.liferay.reestrRayonov.model.Rayon rayon)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rayon with the primary key or throws a {@link com.liferay.reestrRayonov.NoSuchRayonException} if it could not be found.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon
    * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon findByPrimaryKey(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.reestrRayonov.NoSuchRayonException;

    /**
    * Returns the rayon with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rayonId the primary key of the rayon
    * @return the rayon, or <code>null</code> if a rayon with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.reestrRayonov.model.Rayon fetchByPrimaryKey(long rayonId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rayons.
    *
    * @return the rayons
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.reestrRayonov.model.Rayon> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rayons from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rayons.
    *
    * @return the number of rayons
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
