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

package com.apuntesdejava.virtualclassroom.service.persistence;

import com.apuntesdejava.virtualclassroom.model.CourseSession;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the course session service. This utility wraps <code>com.apuntesdejava.virtualclassroom.service.persistence.impl.CourseSessionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionPersistence
 * @generated
 */
@ProviderType
public class CourseSessionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CourseSession courseSession) {
		getPersistence().clearCache(courseSession);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CourseSession> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CourseSession> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CourseSession> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CourseSession> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CourseSession> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CourseSession update(CourseSession courseSession) {
		return getPersistence().update(courseSession);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CourseSession update(
		CourseSession courseSession, ServiceContext serviceContext) {

		return getPersistence().update(courseSession, serviceContext);
	}

	/**
	 * Returns all the course sessions where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the matching course sessions
	 */
	public static List<CourseSession> findByCourseId(long courseId) {
		return getPersistence().findByCourseId(courseId);
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
	public static List<CourseSession> findByCourseId(
		long courseId, int start, int end) {

		return getPersistence().findByCourseId(courseId, start, end);
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
	public static List<CourseSession> findByCourseId(
		long courseId, int start, int end,
		OrderByComparator<CourseSession> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCourseId(
			courseId, start, end, orderByComparator, useFinderCache);
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
	public static List<CourseSession> findByCourseId(
		long courseId, int start, int end,
		OrderByComparator<CourseSession> orderByComparator) {

		return getPersistence().findByCourseId(
			courseId, start, end, orderByComparator);
	}

	/**
	 * Returns the first course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course session
	 * @throws NoSuchCourseSessionException if a matching course session could not be found
	 */
	public static CourseSession findByCourseId_First(
			long courseId, OrderByComparator<CourseSession> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseSessionException {

		return getPersistence().findByCourseId_First(
			courseId, orderByComparator);
	}

	/**
	 * Returns the first course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course session, or <code>null</code> if a matching course session could not be found
	 */
	public static CourseSession fetchByCourseId_First(
		long courseId, OrderByComparator<CourseSession> orderByComparator) {

		return getPersistence().fetchByCourseId_First(
			courseId, orderByComparator);
	}

	/**
	 * Returns the last course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course session
	 * @throws NoSuchCourseSessionException if a matching course session could not be found
	 */
	public static CourseSession findByCourseId_Last(
			long courseId, OrderByComparator<CourseSession> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseSessionException {

		return getPersistence().findByCourseId_Last(
			courseId, orderByComparator);
	}

	/**
	 * Returns the last course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course session, or <code>null</code> if a matching course session could not be found
	 */
	public static CourseSession fetchByCourseId_Last(
		long courseId, OrderByComparator<CourseSession> orderByComparator) {

		return getPersistence().fetchByCourseId_Last(
			courseId, orderByComparator);
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
	public static CourseSession[] findByCourseId_PrevAndNext(
			long courseSessionId, long courseId,
			OrderByComparator<CourseSession> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseSessionException {

		return getPersistence().findByCourseId_PrevAndNext(
			courseSessionId, courseId, orderByComparator);
	}

	/**
	 * Removes all the course sessions where courseId = &#63; from the database.
	 *
	 * @param courseId the course ID
	 */
	public static void removeByCourseId(long courseId) {
		getPersistence().removeByCourseId(courseId);
	}

	/**
	 * Returns the number of course sessions where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the number of matching course sessions
	 */
	public static int countByCourseId(long courseId) {
		return getPersistence().countByCourseId(courseId);
	}

	/**
	 * Caches the course session in the entity cache if it is enabled.
	 *
	 * @param courseSession the course session
	 */
	public static void cacheResult(CourseSession courseSession) {
		getPersistence().cacheResult(courseSession);
	}

	/**
	 * Caches the course sessions in the entity cache if it is enabled.
	 *
	 * @param courseSessions the course sessions
	 */
	public static void cacheResult(List<CourseSession> courseSessions) {
		getPersistence().cacheResult(courseSessions);
	}

	/**
	 * Creates a new course session with the primary key. Does not add the course session to the database.
	 *
	 * @param courseSessionId the primary key for the new course session
	 * @return the new course session
	 */
	public static CourseSession create(long courseSessionId) {
		return getPersistence().create(courseSessionId);
	}

	/**
	 * Removes the course session with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session that was removed
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	public static CourseSession remove(long courseSessionId)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseSessionException {

		return getPersistence().remove(courseSessionId);
	}

	public static CourseSession updateImpl(CourseSession courseSession) {
		return getPersistence().updateImpl(courseSession);
	}

	/**
	 * Returns the course session with the primary key or throws a <code>NoSuchCourseSessionException</code> if it could not be found.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	public static CourseSession findByPrimaryKey(long courseSessionId)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseSessionException {

		return getPersistence().findByPrimaryKey(courseSessionId);
	}

	/**
	 * Returns the course session with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session, or <code>null</code> if a course session with the primary key could not be found
	 */
	public static CourseSession fetchByPrimaryKey(long courseSessionId) {
		return getPersistence().fetchByPrimaryKey(courseSessionId);
	}

	/**
	 * Returns all the course sessions.
	 *
	 * @return the course sessions
	 */
	public static List<CourseSession> findAll() {
		return getPersistence().findAll();
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
	public static List<CourseSession> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<CourseSession> findAll(
		int start, int end, OrderByComparator<CourseSession> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
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
	public static List<CourseSession> findAll(
		int start, int end,
		OrderByComparator<CourseSession> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the course sessions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of course sessions.
	 *
	 * @return the number of course sessions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CourseSessionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CourseSessionPersistence, CourseSessionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CourseSessionPersistence.class);

		ServiceTracker<CourseSessionPersistence, CourseSessionPersistence>
			serviceTracker =
				new ServiceTracker
					<CourseSessionPersistence, CourseSessionPersistence>(
						bundle.getBundleContext(),
						CourseSessionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}