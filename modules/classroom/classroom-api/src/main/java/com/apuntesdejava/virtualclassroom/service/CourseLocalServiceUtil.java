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
 * Provides the local service utility for Course. This utility wraps
 * <code>com.apuntesdejava.virtualclassroom.service.impl.CourseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CourseLocalService
 * @generated
 */
@ProviderType
public class CourseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.apuntesdejava.virtualclassroom.service.impl.CourseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the course to the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was added
	 */
	public static com.apuntesdejava.virtualclassroom.model.Course addCourse(
		com.apuntesdejava.virtualclassroom.model.Course course) {

		return getService().addCourse(course);
	}

	public static com.apuntesdejava.virtualclassroom.model.Course addCourse(
			long groupId, java.util.Map<java.util.Locale, String> name,
			String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCourse(
			groupId, name, description, serviceContext);
	}

	public static int countByGroupId(long groupId) {
		return getService().countByGroupId(groupId);
	}

	public static int countByU_G(long userId, long groupId) {
		return getService().countByU_G(userId, groupId);
	}

	public static int countByUserId(long userId) {
		return getService().countByUserId(userId);
	}

	/**
	 * Creates a new course with the primary key. Does not add the course to the database.
	 *
	 * @param courseId the primary key for the new course
	 * @return the new course
	 */
	public static com.apuntesdejava.virtualclassroom.model.Course createCourse(
		long courseId) {

		return getService().createCourse(courseId);
	}

	/**
	 * Deletes the course from the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was removed
	 */
	public static com.apuntesdejava.virtualclassroom.model.Course deleteCourse(
		com.apuntesdejava.virtualclassroom.model.Course course) {

		return getService().deleteCourse(course);
	}

	/**
	 * Deletes the course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseId the primary key of the course
	 * @return the course that was removed
	 * @throws PortalException if a course with the primary key could not be found
	 */
	public static com.apuntesdejava.virtualclassroom.model.Course deleteCourse(
			long courseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCourse(courseId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.apuntesdejava.virtualclassroom.model.impl.CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.apuntesdejava.virtualclassroom.model.impl.CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.apuntesdejava.virtualclassroom.model.Course fetchCourse(
		long courseId) {

		return getService().fetchCourse(courseId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> findByGroupId(
			long groupId) {

		return getService().findByGroupId(groupId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> findByGroupId(
			long groupId, int start, int end) {

		return getService().findByGroupId(groupId, start, end);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> findByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.apuntesdejava.virtualclassroom.model.Course>
					orderByComparator) {

		return getService().findByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> findByU_G(
			long userId, long groupId) {

		return getService().findByU_G(userId, groupId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> findByU_G(
			long userId, long groupId, int start, int end) {

		return getService().findByU_G(userId, groupId, start, end);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> findByUserId(
			long userId) {

		return getService().findByUserId(userId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> findByUserId(
			long userId, int start, int end) {

		return getService().findByUserId(userId, start, end);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the course with the primary key.
	 *
	 * @param courseId the primary key of the course
	 * @return the course
	 * @throws PortalException if a course with the primary key could not be found
	 */
	public static com.apuntesdejava.virtualclassroom.model.Course getCourse(
			long courseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCourse(courseId);
	}

	/**
	 * Returns a range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.apuntesdejava.virtualclassroom.model.impl.CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of courses
	 */
	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.Course> getCourses(
			int start, int end) {

		return getService().getCourses(start, end);
	}

	/**
	 * Returns the number of courses.
	 *
	 * @return the number of courses
	 */
	public static int getCoursesCount() {
		return getService().getCoursesCount();
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
	 * Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was updated
	 */
	public static com.apuntesdejava.virtualclassroom.model.Course updateCourse(
		com.apuntesdejava.virtualclassroom.model.Course course) {

		return getService().updateCourse(course);
	}

	public static com.apuntesdejava.virtualclassroom.model.Course updateCourse(
			long courseId, java.util.Map<java.util.Locale, String> name,
			String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCourse(
			courseId, name, description, serviceContext);
	}

	public static CourseLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CourseLocalService, CourseLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CourseLocalService.class);

		ServiceTracker<CourseLocalService, CourseLocalService> serviceTracker =
			new ServiceTracker<CourseLocalService, CourseLocalService>(
				bundle.getBundleContext(), CourseLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}