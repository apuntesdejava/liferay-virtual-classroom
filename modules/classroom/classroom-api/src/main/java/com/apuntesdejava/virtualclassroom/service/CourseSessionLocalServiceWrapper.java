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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link CourseSessionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionLocalService
 * @generated
 */
@ProviderType
public class CourseSessionLocalServiceWrapper
	implements CourseSessionLocalService,
			   ServiceWrapper<CourseSessionLocalService> {

	public CourseSessionLocalServiceWrapper(
		CourseSessionLocalService courseSessionLocalService) {

		_courseSessionLocalService = courseSessionLocalService;
	}

	/**
	 * Adds the course session to the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSession the course session
	 * @return the course session that was added
	 */
	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
		addCourseSession(
			com.apuntesdejava.virtualclassroom.model.CourseSession
				courseSession) {

		return _courseSessionLocalService.addCourseSession(courseSession);
	}

	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
			addCourseSession(
				String title, String description, long courseId,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionLocalService.addCourseSession(
			title, description, courseId, dueDate, serviceContext);
	}

	@Override
	public int countByCourseId(long courseId) {
		return _courseSessionLocalService.countByCourseId(courseId);
	}

	/**
	 * Creates a new course session with the primary key. Does not add the course session to the database.
	 *
	 * @param courseSessionId the primary key for the new course session
	 * @return the new course session
	 */
	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
		createCourseSession(long courseSessionId) {

		return _courseSessionLocalService.createCourseSession(courseSessionId);
	}

	/**
	 * Deletes the course session from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSession the course session
	 * @return the course session that was removed
	 */
	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
		deleteCourseSession(
			com.apuntesdejava.virtualclassroom.model.CourseSession
				courseSession) {

		return _courseSessionLocalService.deleteCourseSession(courseSession);
	}

	/**
	 * Deletes the course session with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session that was removed
	 * @throws PortalException if a course session with the primary key could not be found
	 */
	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
			deleteCourseSession(long courseSessionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionLocalService.deleteCourseSession(courseSessionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _courseSessionLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _courseSessionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _courseSessionLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _courseSessionLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _courseSessionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _courseSessionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
		fetchCourseSession(long courseSessionId) {

		return _courseSessionLocalService.fetchCourseSession(courseSessionId);
	}

	@Override
	public java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId) {

		return _courseSessionLocalService.findByCourseId(courseId);
	}

	@Override
	public java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId, int start, int end) {

		return _courseSessionLocalService.findByCourseId(courseId, start, end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _courseSessionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the course session with the primary key.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session
	 * @throws PortalException if a course session with the primary key could not be found
	 */
	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
			getCourseSession(long courseSessionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionLocalService.getCourseSession(courseSessionId);
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
	@Override
	public java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession>
			getCourseSessions(int start, int end) {

		return _courseSessionLocalService.getCourseSessions(start, end);
	}

	/**
	 * Returns the number of course sessions.
	 *
	 * @return the number of course sessions
	 */
	@Override
	public int getCourseSessionsCount() {
		return _courseSessionLocalService.getCourseSessionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _courseSessionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _courseSessionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the course session in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param courseSession the course session
	 * @return the course session that was updated
	 */
	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
		updateCourseSession(
			com.apuntesdejava.virtualclassroom.model.CourseSession
				courseSession) {

		return _courseSessionLocalService.updateCourseSession(courseSession);
	}

	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
			updateCourseSession(
				long courseSessionId, String title, String description,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionLocalService.updateCourseSession(
			courseSessionId, title, description, dueDate, serviceContext);
	}

	@Override
	public CourseSessionLocalService getWrappedService() {
		return _courseSessionLocalService;
	}

	@Override
	public void setWrappedService(
		CourseSessionLocalService courseSessionLocalService) {

		_courseSessionLocalService = courseSessionLocalService;
	}

	private CourseSessionLocalService _courseSessionLocalService;

}