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

package com.apuntesdejava.virtualclassroom.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CourseSession. This utility wraps
 * <code>com.apuntesdejava.virtualclassroom.service.impl.CourseSessionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionLocalService
 * @generated
 */
@ProviderType
public class CourseSessionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.apuntesdejava.virtualclassroom.service.impl.CourseSessionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the course session to the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSession the course session
	 * @return the course session that was added
	 */
	public static com.apuntesdejava.virtualclassroom.model.CourseSession
		addCourseSession(
			com.apuntesdejava.virtualclassroom.model.CourseSession
				courseSession) {

		return getService().addCourseSession(courseSession);
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			addCourseSession(
				String title, String description, long courseId,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCourseSession(
			title, description, courseId, dueDate, serviceContext);
	}

	public static int countByCourseId(long courseId) {
		return getService().countByCourseId(courseId);
	}

	/**
	 * Creates a new course session with the primary key. Does not add the course session to the database.
	 *
	 * @param courseSessionId the primary key for the new course session
	 * @return the new course session
	 */
	public static com.apuntesdejava.virtualclassroom.model.CourseSession
		createCourseSession(long courseSessionId) {

		return getService().createCourseSession(courseSessionId);
	}

	/**
	 * Deletes the course session from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSession the course session
	 * @return the course session that was removed
	 */
	public static com.apuntesdejava.virtualclassroom.model.CourseSession
		deleteCourseSession(
			com.apuntesdejava.virtualclassroom.model.CourseSession
				courseSession) {

		return getService().deleteCourseSession(courseSession);
	}

	/**
	 * Deletes the course session with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session that was removed
	 * @throws PortalException if a course session with the primary key could not be found
	 */
	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			deleteCourseSession(long courseSessionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCourseSession(courseSessionId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.apuntesdejava.virtualclassroom.model.impl.CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.apuntesdejava.virtualclassroom.model.impl.CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSession
		fetchCourseSession(long courseSessionId) {

		return getService().fetchCourseSession(courseSessionId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId) {

		return getService().findByCourseId(courseId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId, int start, int end) {

		return getService().findByCourseId(courseId, start, end);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the course session with the primary key.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session
	 * @throws PortalException if a course session with the primary key could not be found
	 */
	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			getCourseSession(long courseSessionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCourseSession(courseSessionId);
	}

	/**
	 * Returns a range of all the course sessions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.apuntesdejava.virtualclassroom.model.impl.CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @return the range of course sessions
	 */
	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession>
			getCourseSessions(int start, int end) {

		return getService().getCourseSessions(start, end);
	}

	/**
	 * Returns the number of course sessions.
	 *
	 * @return the number of course sessions
	 */
	public static int getCourseSessionsCount() {
		return getService().getCourseSessionsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the course session in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param courseSession the course session
	 * @return the course session that was updated
	 */
	public static com.apuntesdejava.virtualclassroom.model.CourseSession
		updateCourseSession(
			com.apuntesdejava.virtualclassroom.model.CourseSession
				courseSession) {

		return getService().updateCourseSession(courseSession);
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			updateCourseSession(
				long courseSessionId, String title, String description,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCourseSession(
			courseSessionId, title, description, dueDate, serviceContext);
	}

	public static CourseSessionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CourseSessionLocalService, CourseSessionLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			CourseSessionLocalService.class);

		ServiceTracker<CourseSessionLocalService, CourseSessionLocalService>
			serviceTracker =
				new ServiceTracker
					<CourseSessionLocalService, CourseSessionLocalService>(
						bundle.getBundleContext(),
						CourseSessionLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}