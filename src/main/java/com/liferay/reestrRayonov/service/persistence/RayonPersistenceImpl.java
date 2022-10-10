package com.liferay.reestrRayonov.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.reestrRayonov.NoSuchRayonException;
import com.liferay.reestrRayonov.model.Rayon;
import com.liferay.reestrRayonov.model.impl.RayonImpl;
import com.liferay.reestrRayonov.model.impl.RayonModelImpl;
import com.liferay.reestrRayonov.service.persistence.RayonPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rayon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liza
 * @see RayonPersistence
 * @see RayonUtil
 * @generated
 */
public class RayonPersistenceImpl extends BasePersistenceImpl<Rayon>
    implements RayonPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RayonUtil} to access the rayon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RayonImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RAYONID = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByrayonId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONID =
        new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByrayonId",
            new String[] { Long.class.getName() },
            RayonModelImpl.RAYONID_COLUMN_BITMASK |
            RayonModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RAYONID = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrayonId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_RAYONID_RAYONID_2 = "rayon.rayonId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
            new String[] { String.class.getName() },
            RayonModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NAME_NAME_1 = "rayon.name IS NULL";
    private static final String _FINDER_COLUMN_NAME_NAME_2 = "rayon.name = ?";
    private static final String _FINDER_COLUMN_NAME_NAME_3 = "(rayon.name IS NULL OR rayon.name = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KOD = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByKod",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KOD = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByKod",
            new String[] { Integer.class.getName() },
            RayonModelImpl.KOD_COLUMN_BITMASK |
            RayonModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_KOD = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKod",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_KOD_KOD_2 = "rayon.kod = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVE = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArchive",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE =
        new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, RayonImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArchive",
            new String[] { Boolean.class.getName() },
            RayonModelImpl.ARCHIVE_COLUMN_BITMASK |
            RayonModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ARCHIVE = new FinderPath(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArchive",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ARCHIVE_ARCHIVE_2 = "rayon.archive = ?";
    private static final String _SQL_SELECT_RAYON = "SELECT rayon FROM Rayon rayon";
    private static final String _SQL_SELECT_RAYON_WHERE = "SELECT rayon FROM Rayon rayon WHERE ";
    private static final String _SQL_COUNT_RAYON = "SELECT COUNT(rayon) FROM Rayon rayon";
    private static final String _SQL_COUNT_RAYON_WHERE = "SELECT COUNT(rayon) FROM Rayon rayon WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "rayon.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Rayon exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Rayon exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RayonPersistenceImpl.class);
    private static Rayon _nullRayon = new RayonImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Rayon> toCacheModel() {
                return _nullRayonCacheModel;
            }
        };

    private static CacheModel<Rayon> _nullRayonCacheModel = new CacheModel<Rayon>() {
            @Override
            public Rayon toEntityModel() {
                return _nullRayon;
            }
        };

    public RayonPersistenceImpl() {
        setModelClass(Rayon.class);
    }

    /**
     * Returns all the rayons where rayonId = &#63;.
     *
     * @param rayonId the rayon ID
     * @return the matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rayon> findByrayonId(long rayonId) throws SystemException {
        return findByrayonId(rayonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Rayon> findByrayonId(long rayonId, int start, int end)
        throws SystemException {
        return findByrayonId(rayonId, start, end, null);
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
    @Override
    public List<Rayon> findByrayonId(long rayonId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONID;
            finderArgs = new Object[] { rayonId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RAYONID;
            finderArgs = new Object[] { rayonId, start, end, orderByComparator };
        }

        List<Rayon> list = (List<Rayon>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Rayon rayon : list) {
                if ((rayonId != rayon.getRayonId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_RAYON_WHERE);

            query.append(_FINDER_COLUMN_RAYONID_RAYONID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RayonModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(rayonId);

                if (!pagination) {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Rayon>(list);
                } else {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Rayon findByrayonId_First(long rayonId,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByrayonId_First(rayonId, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rayonId=");
        msg.append(rayonId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the first rayon in the ordered set where rayonId = &#63;.
     *
     * @param rayonId the rayon ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByrayonId_First(long rayonId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Rayon> list = findByrayonId(rayonId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Rayon findByrayonId_Last(long rayonId,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByrayonId_Last(rayonId, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("rayonId=");
        msg.append(rayonId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the last rayon in the ordered set where rayonId = &#63;.
     *
     * @param rayonId the rayon ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByrayonId_Last(long rayonId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByrayonId(rayonId);

        if (count == 0) {
            return null;
        }

        List<Rayon> list = findByrayonId(rayonId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the rayons where rayonId = &#63; from the database.
     *
     * @param rayonId the rayon ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByrayonId(long rayonId) throws SystemException {
        for (Rayon rayon : findByrayonId(rayonId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(rayon);
        }
    }

    /**
     * Returns the number of rayons where rayonId = &#63;.
     *
     * @param rayonId the rayon ID
     * @return the number of matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByrayonId(long rayonId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RAYONID;

        Object[] finderArgs = new Object[] { rayonId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RAYON_WHERE);

            query.append(_FINDER_COLUMN_RAYONID_RAYONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(rayonId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the rayons where name = &#63;.
     *
     * @param name the name
     * @return the matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rayon> findByName(String name) throws SystemException {
        return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Rayon> findByName(String name, int start, int end)
        throws SystemException {
        return findByName(name, start, end, null);
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
    @Override
    public List<Rayon> findByName(String name, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name, start, end, orderByComparator };
        }

        List<Rayon> list = (List<Rayon>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Rayon rayon : list) {
                if (!Validator.equals(name, rayon.getName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_RAYON_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RayonModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                if (!pagination) {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Rayon>(list);
                } else {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Rayon findByName_First(String name,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByName_First(name, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the first rayon in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByName_First(String name,
        OrderByComparator orderByComparator) throws SystemException {
        List<Rayon> list = findByName(name, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Rayon findByName_Last(String name,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByName_Last(name, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the last rayon in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByName_Last(String name,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByName(name);

        if (count == 0) {
            return null;
        }

        List<Rayon> list = findByName(name, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Rayon[] findByName_PrevAndNext(long rayonId, String name,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = findByPrimaryKey(rayonId);

        Session session = null;

        try {
            session = openSession();

            Rayon[] array = new RayonImpl[3];

            array[0] = getByName_PrevAndNext(session, rayon, name,
                    orderByComparator, true);

            array[1] = rayon;

            array[2] = getByName_PrevAndNext(session, rayon, name,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Rayon getByName_PrevAndNext(Session session, Rayon rayon,
        String name, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RAYON_WHERE);

        boolean bindName = false;

        if (name == null) {
            query.append(_FINDER_COLUMN_NAME_NAME_1);
        } else if (name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_NAME_3);
        } else {
            bindName = true;

            query.append(_FINDER_COLUMN_NAME_NAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RayonModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindName) {
            qPos.add(name);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rayon);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Rayon> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rayons where name = &#63; from the database.
     *
     * @param name the name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByName(String name) throws SystemException {
        for (Rayon rayon : findByName(name, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(rayon);
        }
    }

    /**
     * Returns the number of rayons where name = &#63;.
     *
     * @param name the name
     * @return the number of matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByName(String name) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

        Object[] finderArgs = new Object[] { name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RAYON_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the rayons where kod = &#63;.
     *
     * @param kod the kod
     * @return the matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rayon> findByKod(int kod) throws SystemException {
        return findByKod(kod, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Rayon> findByKod(int kod, int start, int end)
        throws SystemException {
        return findByKod(kod, start, end, null);
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
    @Override
    public List<Rayon> findByKod(int kod, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KOD;
            finderArgs = new Object[] { kod };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KOD;
            finderArgs = new Object[] { kod, start, end, orderByComparator };
        }

        List<Rayon> list = (List<Rayon>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Rayon rayon : list) {
                if ((kod != rayon.getKod())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_RAYON_WHERE);

            query.append(_FINDER_COLUMN_KOD_KOD_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RayonModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(kod);

                if (!pagination) {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Rayon>(list);
                } else {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Rayon findByKod_First(int kod, OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByKod_First(kod, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("kod=");
        msg.append(kod);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the first rayon in the ordered set where kod = &#63;.
     *
     * @param kod the kod
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByKod_First(int kod, OrderByComparator orderByComparator)
        throws SystemException {
        List<Rayon> list = findByKod(kod, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Rayon findByKod_Last(int kod, OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByKod_Last(kod, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("kod=");
        msg.append(kod);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the last rayon in the ordered set where kod = &#63;.
     *
     * @param kod the kod
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByKod_Last(int kod, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByKod(kod);

        if (count == 0) {
            return null;
        }

        List<Rayon> list = findByKod(kod, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Rayon[] findByKod_PrevAndNext(long rayonId, int kod,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = findByPrimaryKey(rayonId);

        Session session = null;

        try {
            session = openSession();

            Rayon[] array = new RayonImpl[3];

            array[0] = getByKod_PrevAndNext(session, rayon, kod,
                    orderByComparator, true);

            array[1] = rayon;

            array[2] = getByKod_PrevAndNext(session, rayon, kod,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Rayon getByKod_PrevAndNext(Session session, Rayon rayon, int kod,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RAYON_WHERE);

        query.append(_FINDER_COLUMN_KOD_KOD_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RayonModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(kod);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rayon);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Rayon> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rayons where kod = &#63; from the database.
     *
     * @param kod the kod
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByKod(int kod) throws SystemException {
        for (Rayon rayon : findByKod(kod, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(rayon);
        }
    }

    /**
     * Returns the number of rayons where kod = &#63;.
     *
     * @param kod the kod
     * @return the number of matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByKod(int kod) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_KOD;

        Object[] finderArgs = new Object[] { kod };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RAYON_WHERE);

            query.append(_FINDER_COLUMN_KOD_KOD_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(kod);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the rayons where archive = &#63;.
     *
     * @param archive the archive
     * @return the matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rayon> findByArchive(boolean archive) throws SystemException {
        return findByArchive(archive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Rayon> findByArchive(boolean archive, int start, int end)
        throws SystemException {
        return findByArchive(archive, start, end, null);
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
    @Override
    public List<Rayon> findByArchive(boolean archive, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE;
            finderArgs = new Object[] { archive };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVE;
            finderArgs = new Object[] { archive, start, end, orderByComparator };
        }

        List<Rayon> list = (List<Rayon>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Rayon rayon : list) {
                if ((archive != rayon.getArchive())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_RAYON_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RayonModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive);

                if (!pagination) {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Rayon>(list);
                } else {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Rayon findByArchive_First(boolean archive,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByArchive_First(archive, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive=");
        msg.append(archive);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the first rayon in the ordered set where archive = &#63;.
     *
     * @param archive the archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByArchive_First(boolean archive,
        OrderByComparator orderByComparator) throws SystemException {
        List<Rayon> list = findByArchive(archive, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Rayon findByArchive_Last(boolean archive,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByArchive_Last(archive, orderByComparator);

        if (rayon != null) {
            return rayon;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive=");
        msg.append(archive);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRayonException(msg.toString());
    }

    /**
     * Returns the last rayon in the ordered set where archive = &#63;.
     *
     * @param archive the archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching rayon, or <code>null</code> if a matching rayon could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByArchive_Last(boolean archive,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByArchive(archive);

        if (count == 0) {
            return null;
        }

        List<Rayon> list = findByArchive(archive, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Rayon[] findByArchive_PrevAndNext(long rayonId, boolean archive,
        OrderByComparator orderByComparator)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = findByPrimaryKey(rayonId);

        Session session = null;

        try {
            session = openSession();

            Rayon[] array = new RayonImpl[3];

            array[0] = getByArchive_PrevAndNext(session, rayon, archive,
                    orderByComparator, true);

            array[1] = rayon;

            array[2] = getByArchive_PrevAndNext(session, rayon, archive,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Rayon getByArchive_PrevAndNext(Session session, Rayon rayon,
        boolean archive, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RAYON_WHERE);

        query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RayonModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(archive);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(rayon);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Rayon> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the rayons where archive = &#63; from the database.
     *
     * @param archive the archive
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByArchive(boolean archive) throws SystemException {
        for (Rayon rayon : findByArchive(archive, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(rayon);
        }
    }

    /**
     * Returns the number of rayons where archive = &#63;.
     *
     * @param archive the archive
     * @return the number of matching rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByArchive(boolean archive) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ARCHIVE;

        Object[] finderArgs = new Object[] { archive };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RAYON_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the rayon in the entity cache if it is enabled.
     *
     * @param rayon the rayon
     */
    @Override
    public void cacheResult(Rayon rayon) {
        EntityCacheUtil.putResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonImpl.class, rayon.getPrimaryKey(), rayon);

        rayon.resetOriginalValues();
    }

    /**
     * Caches the rayons in the entity cache if it is enabled.
     *
     * @param rayons the rayons
     */
    @Override
    public void cacheResult(List<Rayon> rayons) {
        for (Rayon rayon : rayons) {
            if (EntityCacheUtil.getResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
                        RayonImpl.class, rayon.getPrimaryKey()) == null) {
                cacheResult(rayon);
            } else {
                rayon.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all rayons.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RayonImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RayonImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the rayon.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Rayon rayon) {
        EntityCacheUtil.removeResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonImpl.class, rayon.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Rayon> rayons) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Rayon rayon : rayons) {
            EntityCacheUtil.removeResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
                RayonImpl.class, rayon.getPrimaryKey());
        }
    }

    /**
     * Creates a new rayon with the primary key. Does not add the rayon to the database.
     *
     * @param rayonId the primary key for the new rayon
     * @return the new rayon
     */
    @Override
    public Rayon create(long rayonId) {
        Rayon rayon = new RayonImpl();

        rayon.setNew(true);
        rayon.setPrimaryKey(rayonId);

        return rayon;
    }

    /**
     * Removes the rayon with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param rayonId the primary key of the rayon
     * @return the rayon that was removed
     * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon remove(long rayonId)
        throws NoSuchRayonException, SystemException {
        return remove((Serializable) rayonId);
    }

    /**
     * Removes the rayon with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the rayon
     * @return the rayon that was removed
     * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon remove(Serializable primaryKey)
        throws NoSuchRayonException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Rayon rayon = (Rayon) session.get(RayonImpl.class, primaryKey);

            if (rayon == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRayonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(rayon);
        } catch (NoSuchRayonException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Rayon removeImpl(Rayon rayon) throws SystemException {
        rayon = toUnwrappedModel(rayon);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(rayon)) {
                rayon = (Rayon) session.get(RayonImpl.class,
                        rayon.getPrimaryKeyObj());
            }

            if (rayon != null) {
                session.delete(rayon);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (rayon != null) {
            clearCache(rayon);
        }

        return rayon;
    }

    @Override
    public Rayon updateImpl(com.liferay.reestrRayonov.model.Rayon rayon)
        throws SystemException {
        rayon = toUnwrappedModel(rayon);

        boolean isNew = rayon.isNew();

        RayonModelImpl rayonModelImpl = (RayonModelImpl) rayon;

        Session session = null;

        try {
            session = openSession();

            if (rayon.isNew()) {
                session.save(rayon);

                rayon.setNew(false);
            } else {
                session.merge(rayon);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RayonModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((rayonModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { rayonModelImpl.getOriginalRayonId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RAYONID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONID,
                    args);

                args = new Object[] { rayonModelImpl.getRayonId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RAYONID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RAYONID,
                    args);
            }

            if ((rayonModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { rayonModelImpl.getOriginalName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);

                args = new Object[] { rayonModelImpl.getName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);
            }

            if ((rayonModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KOD.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { rayonModelImpl.getOriginalKod() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KOD, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KOD,
                    args);

                args = new Object[] { rayonModelImpl.getKod() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_KOD, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KOD,
                    args);
            }

            if ((rayonModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { rayonModelImpl.getOriginalArchive() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE,
                    args);

                args = new Object[] { rayonModelImpl.getArchive() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE,
                    args);
            }
        }

        EntityCacheUtil.putResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
            RayonImpl.class, rayon.getPrimaryKey(), rayon);

        return rayon;
    }

    protected Rayon toUnwrappedModel(Rayon rayon) {
        if (rayon instanceof RayonImpl) {
            return rayon;
        }

        RayonImpl rayonImpl = new RayonImpl();

        rayonImpl.setNew(rayon.isNew());
        rayonImpl.setPrimaryKey(rayon.getPrimaryKey());

        rayonImpl.setRayonId(rayon.getRayonId());
        rayonImpl.setName(rayon.getName());
        rayonImpl.setKod(rayon.getKod());
        rayonImpl.setArchive(rayon.isArchive());

        return rayonImpl;
    }

    /**
     * Returns the rayon with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the rayon
     * @return the rayon
     * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRayonException, SystemException {
        Rayon rayon = fetchByPrimaryKey(primaryKey);

        if (rayon == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRayonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return rayon;
    }

    /**
     * Returns the rayon with the primary key or throws a {@link com.liferay.reestrRayonov.NoSuchRayonException} if it could not be found.
     *
     * @param rayonId the primary key of the rayon
     * @return the rayon
     * @throws com.liferay.reestrRayonov.NoSuchRayonException if a rayon with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon findByPrimaryKey(long rayonId)
        throws NoSuchRayonException, SystemException {
        return findByPrimaryKey((Serializable) rayonId);
    }

    /**
     * Returns the rayon with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the rayon
     * @return the rayon, or <code>null</code> if a rayon with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Rayon rayon = (Rayon) EntityCacheUtil.getResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
                RayonImpl.class, primaryKey);

        if (rayon == _nullRayon) {
            return null;
        }

        if (rayon == null) {
            Session session = null;

            try {
                session = openSession();

                rayon = (Rayon) session.get(RayonImpl.class, primaryKey);

                if (rayon != null) {
                    cacheResult(rayon);
                } else {
                    EntityCacheUtil.putResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
                        RayonImpl.class, primaryKey, _nullRayon);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RayonModelImpl.ENTITY_CACHE_ENABLED,
                    RayonImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return rayon;
    }

    /**
     * Returns the rayon with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param rayonId the primary key of the rayon
     * @return the rayon, or <code>null</code> if a rayon with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Rayon fetchByPrimaryKey(long rayonId) throws SystemException {
        return fetchByPrimaryKey((Serializable) rayonId);
    }

    /**
     * Returns all the rayons.
     *
     * @return the rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Rayon> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Rayon> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Rayon> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Rayon> list = (List<Rayon>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_RAYON);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_RAYON;

                if (pagination) {
                    sql = sql.concat(RayonModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Rayon>(list);
                } else {
                    list = (List<Rayon>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the rayons from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Rayon rayon : findAll()) {
            remove(rayon);
        }
    }

    /**
     * Returns the number of rayons.
     *
     * @return the number of rayons
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_RAYON);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the rayon persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.reestrRayonov.model.Rayon")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Rayon>> listenersList = new ArrayList<ModelListener<Rayon>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Rayon>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RayonImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
