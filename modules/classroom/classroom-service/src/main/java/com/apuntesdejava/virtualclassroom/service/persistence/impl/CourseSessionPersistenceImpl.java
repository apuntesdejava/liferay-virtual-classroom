/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.apuntesdejava.virtualclassroom.service.persistence.impl;

import com.apuntesdejava.virtualclassroom.exception.NoSuchCourseSessionException;
import com.apuntesdejava.virtualclassroom.model.CourseSession;
import com.apuntesdejava.virtualclassroom.model.impl.CourseSessionImpl;
import com.apuntesdejava.virtualclassroom.model.impl.CourseSessionModelImpl;
import com.apuntesdejava.virtualclassroom.service.persistence.CourseSessionPersistence;
import com.apuntesdejava.virtualclassroom.service.persistence.impl.constants.vcPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the course session service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CourseSessionPersistence.class)
@ProviderType
public class CourseSessionPersistenceImpl
	extends BasePersistenceImpl<CourseSession>
	implements CourseSessionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CourseSessionUtil</code> to access the course session persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CourseSessionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByCourseId;
	private FinderPath _finderPathWithoutPaginationFindByCourseId;
	private FinderPath _finderPathCountByCourseId;

	/**
	 * Returns all the course sessions where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the matching course sessions
	 */
	@Override
	public List<CourseSession> findByCourseId(long courseId) {
		return findByCourseId(
			courseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course sessions where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @return the range of matching course sessions
	 */
	@Override
	public List<CourseSession> findByCourseId(
		long courseId, int start, int end) {

		return findByCourseId(courseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course sessions where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCourseId(long, int, int, OrderByComparator)}
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching course sessions
	 */
	@Deprecated
	@Override
	public List<CourseSession> findByCourseId(
		long courseId, int start, int end,
		OrderByComparator<CourseSession> orderByComparator,
		boolean useFinderCache) {

		return findByCourseId(courseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the course sessions where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course sessions
	 */
	@Override
	public List<CourseSession> findByCourseId(
		long courseId, int start, int end,
		OrderByComparator<CourseSession> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByCourseId;
			finderArgs = new Object[] {courseId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByCourseId;
			finderArgs = new Object[] {courseId, start, end, orderByComparator};
		}

		List<CourseSession> list = (List<CourseSession>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSession courseSession : list) {
				if ((courseId != courseSession.getCourseId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSESESSION_WHERE);

			query.append(_FINDER_COLUMN_COURSEID_COURSEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(CourseSessionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courseId);

				if (!pagination) {
					list = (List<CourseSession>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CourseSession>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course session
	 * @throws NoSuchCourseSessionException if a matching course session could not be found
	 */
	@Override
	public CourseSession findByCourseId_First(
			long courseId, OrderByComparator<CourseSession> orderByComparator)
		throws NoSuchCourseSessionException {

		CourseSession courseSession = fetchByCourseId_First(
			courseId, orderByComparator);

		if (courseSession != null) {
			return courseSession;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseId=");
		msg.append(courseId);

		msg.append("}");

		throw new NoSuchCourseSessionException(msg.toString());
	}

	/**
	 * Returns the first course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course session, or <code>null</code> if a matching course session could not be found
	 */
	@Override
	public CourseSession fetchByCourseId_First(
		long courseId, OrderByComparator<CourseSession> orderByComparator) {

		List<CourseSession> list = findByCourseId(
			courseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course session
	 * @throws NoSuchCourseSessionException if a matching course session could not be found
	 */
	@Override
	public CourseSession findByCourseId_Last(
			long courseId, OrderByComparator<CourseSession> orderByComparator)
		throws NoSuchCourseSessionException {

		CourseSession courseSession = fetchByCourseId_Last(
			courseId, orderByComparator);

		if (courseSession != null) {
			return courseSession;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseId=");
		msg.append(courseId);

		msg.append("}");

		throw new NoSuchCourseSessionException(msg.toString());
	}

	/**
	 * Returns the last course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course session, or <code>null</code> if a matching course session could not be found
	 */
	@Override
	public CourseSession fetchByCourseId_Last(
		long courseId, OrderByComparator<CourseSession> orderByComparator) {

		int count = countByCourseId(courseId);

		if (count == 0) {
			return null;
		}

		List<CourseSession> list = findByCourseId(
			courseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course sessions before and after the current course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseSessionId the primary key of the current course session
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course session
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	@Override
	public CourseSession[] findByCourseId_PrevAndNext(
			long courseSessionId, long courseId,
			OrderByComparator<CourseSession> orderByComparator)
		throws NoSuchCourseSessionException {

		CourseSession courseSession = findByPrimaryKey(courseSessionId);

		Session session = null;

		try {
			session = openSession();

			CourseSession[] array = new CourseSessionImpl[3];

			array[0] = getByCourseId_PrevAndNext(
				session, courseSession, courseId, orderByComparator, true);

			array[1] = courseSession;

			array[2] = getByCourseId_PrevAndNext(
				session, courseSession, courseId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSession getByCourseId_PrevAndNext(
		Session session, CourseSession courseSession, long courseId,
		OrderByComparator<CourseSession> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESESSION_WHERE);

		query.append(_FINDER_COLUMN_COURSEID_COURSEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
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
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSessionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(courseId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						courseSession)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<CourseSession> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course sessions where courseId = &#63; from the database.
	 *
	 * @param courseId the course ID
	 */
	@Override
	public void removeByCourseId(long courseId) {
		for (CourseSession courseSession :
				findByCourseId(
					courseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(courseSession);
		}
	}

	/**
	 * Returns the number of course sessions where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the number of matching course sessions
	 */
	@Override
	public int countByCourseId(long courseId) {
		FinderPath finderPath = _finderPathCountByCourseId;

		Object[] finderArgs = new Object[] {courseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSESESSION_WHERE);

			query.append(_FINDER_COLUMN_COURSEID_COURSEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courseId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COURSEID_COURSEID_2 =
		"courseSession.courseId = ?";

	public CourseSessionPersistenceImpl() {
		setModelClass(CourseSession.class);

		setModelImplClass(CourseSessionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the course session in the entity cache if it is enabled.
	 *
	 * @param courseSession the course session
	 */
	@Override
	public void cacheResult(CourseSession courseSession) {
		entityCache.putResult(
			entityCacheEnabled, CourseSessionImpl.class,
			courseSession.getPrimaryKey(), courseSession);

		courseSession.resetOriginalValues();
	}

	/**
	 * Caches the course sessions in the entity cache if it is enabled.
	 *
	 * @param courseSessions the course sessions
	 */
	@Override
	public void cacheResult(List<CourseSession> courseSessions) {
		for (CourseSession courseSession : courseSessions) {
			if (entityCache.getResult(
					entityCacheEnabled, CourseSessionImpl.class,
					courseSession.getPrimaryKey()) == null) {

				cacheResult(courseSession);
			}
			else {
				courseSession.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all course sessions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CourseSessionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the course session.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CourseSession courseSession) {
		entityCache.removeResult(
			entityCacheEnabled, CourseSessionImpl.class,
			courseSession.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CourseSession> courseSessions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CourseSession courseSession : courseSessions) {
			entityCache.removeResult(
				entityCacheEnabled, CourseSessionImpl.class,
				courseSession.getPrimaryKey());
		}
	}

	/**
	 * Creates a new course session with the primary key. Does not add the course session to the database.
	 *
	 * @param courseSessionId the primary key for the new course session
	 * @return the new course session
	 */
	@Override
	public CourseSession create(long courseSessionId) {
		CourseSession courseSession = new CourseSessionImpl();

		courseSession.setNew(true);
		courseSession.setPrimaryKey(courseSessionId);

		courseSession.setCompanyId(CompanyThreadLocal.getCompanyId());

		return courseSession;
	}

	/**
	 * Removes the course session with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session that was removed
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	@Override
	public CourseSession remove(long courseSessionId)
		throws NoSuchCourseSessionException {

		return remove((Serializable)courseSessionId);
	}

	/**
	 * Removes the course session with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the course session
	 * @return the course session that was removed
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	@Override
	public CourseSession remove(Serializable primaryKey)
		throws NoSuchCourseSessionException {

		Session session = null;

		try {
			session = openSession();

			CourseSession courseSession = (CourseSession)session.get(
				CourseSessionImpl.class, primaryKey);

			if (courseSession == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCourseSessionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(courseSession);
		}
		catch (NoSuchCourseSessionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CourseSession removeImpl(CourseSession courseSession) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(courseSession)) {
				courseSession = (CourseSession)session.get(
					CourseSessionImpl.class, courseSession.getPrimaryKeyObj());
			}

			if (courseSession != null) {
				session.delete(courseSession);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (courseSession != null) {
			clearCache(courseSession);
		}

		return courseSession;
	}

	@Override
	public CourseSession updateImpl(CourseSession courseSession) {
		boolean isNew = courseSession.isNew();

		if (!(courseSession instanceof CourseSessionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(courseSession.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					courseSession);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in courseSession proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CourseSession implementation " +
					courseSession.getClass());
		}

		CourseSessionModelImpl courseSessionModelImpl =
			(CourseSessionModelImpl)courseSession;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (courseSession.getCreateDate() == null)) {
			if (serviceContext == null) {
				courseSession.setCreateDate(now);
			}
			else {
				courseSession.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!courseSessionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				courseSession.setModifiedDate(now);
			}
			else {
				courseSession.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (courseSession.isNew()) {
				session.save(courseSession);

				courseSession.setNew(false);
			}
			else {
				courseSession = (CourseSession)session.merge(courseSession);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {courseSessionModelImpl.getCourseId()};

			finderCache.removeResult(_finderPathCountByCourseId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCourseId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((courseSessionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCourseId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					courseSessionModelImpl.getOriginalCourseId()
				};

				finderCache.removeResult(_finderPathCountByCourseId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCourseId, args);

				args = new Object[] {courseSessionModelImpl.getCourseId()};

				finderCache.removeResult(_finderPathCountByCourseId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCourseId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, CourseSessionImpl.class,
			courseSession.getPrimaryKey(), courseSession, false);

		courseSession.resetOriginalValues();

		return courseSession;
	}

	/**
	 * Returns the course session with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the course session
	 * @return the course session
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	@Override
	public CourseSession findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCourseSessionException {

		CourseSession courseSession = fetchByPrimaryKey(primaryKey);

		if (courseSession == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCourseSessionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return courseSession;
	}

	/**
	 * Returns the course session with the primary key or throws a <code>NoSuchCourseSessionException</code> if it could not be found.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	@Override
	public CourseSession findByPrimaryKey(long courseSessionId)
		throws NoSuchCourseSessionException {

		return findByPrimaryKey((Serializable)courseSessionId);
	}

	/**
	 * Returns the course session with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session, or <code>null</code> if a course session with the primary key could not be found
	 */
	@Override
	public CourseSession fetchByPrimaryKey(long courseSessionId) {
		return fetchByPrimaryKey((Serializable)courseSessionId);
	}

	/**
	 * Returns all the course sessions.
	 *
	 * @return the course sessions
	 */
	@Override
	public List<CourseSession> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course sessions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @return the range of course sessions
	 */
	@Override
	public List<CourseSession> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the course sessions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of course sessions
	 */
	@Deprecated
	@Override
	public List<CourseSession> findAll(
		int start, int end, OrderByComparator<CourseSession> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the course sessions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of course sessions
	 */
	@Override
	public List<CourseSession> findAll(
		int start, int end,
		OrderByComparator<CourseSession> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<CourseSession> list = (List<CourseSession>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COURSESESSION);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COURSESESSION;

				if (pagination) {
					sql = sql.concat(CourseSessionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CourseSession>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CourseSession>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the course sessions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CourseSession courseSession : findAll()) {
			remove(courseSession);
		}
	}

	/**
	 * Returns the number of course sessions.
	 *
	 * @return the number of course sessions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COURSESESSION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "courseSessionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COURSESESSION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CourseSessionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the course session persistence.
	 */
	@Activate
	public void activate() {
		CourseSessionModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		CourseSessionModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, CourseSessionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, CourseSessionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByCourseId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, CourseSessionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCourseId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCourseId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, CourseSessionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCourseId",
			new String[] {Long.class.getName()},
			CourseSessionModelImpl.COURSEID_COLUMN_BITMASK);

		_finderPathCountByCourseId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCourseId",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(CourseSessionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = vcPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.apuntesdejava.virtualclassroom.model.CourseSession"),
			true);
	}

	@Override
	@Reference(
		target = vcPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = vcPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_COURSESESSION =
		"SELECT courseSession FROM CourseSession courseSession";

	private static final String _SQL_SELECT_COURSESESSION_WHERE =
		"SELECT courseSession FROM CourseSession courseSession WHERE ";

	private static final String _SQL_COUNT_COURSESESSION =
		"SELECT COUNT(courseSession) FROM CourseSession courseSession";

	private static final String _SQL_COUNT_COURSESESSION_WHERE =
		"SELECT COUNT(courseSession) FROM CourseSession courseSession WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "courseSession.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CourseSession exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CourseSession exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CourseSessionPersistenceImpl.class);

	static {
		try {
			Class.forName(vcPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}