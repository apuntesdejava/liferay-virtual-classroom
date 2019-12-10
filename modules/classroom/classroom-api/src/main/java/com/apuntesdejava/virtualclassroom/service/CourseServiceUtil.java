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
 * Provides the remote service utility for Course. This utility wraps
 * <code>com.apuntesdejava.virtualclassroom.service.impl.CourseServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CourseService
 * @generated
 */
@ProviderType
public class CourseServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.apuntesdejava.virtualclassroom.service.impl.CourseServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
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

	public static com.apuntesdejava.virtualclassroom.model.Course deleteCourse(
			long courseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteCourse(courseId);
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

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.apuntesdejava.virtualclassroom.model.Course updateCourse(
			long courseId, java.util.Map<java.util.Locale, String> name,
			String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCourse(
			courseId, name, description, serviceContext);
	}

	public static CourseService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CourseService, CourseService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CourseService.class);

		ServiceTracker<CourseService, CourseService> serviceTracker =
			new ServiceTracker<CourseService, CourseService>(
				bundle.getBundleContext(), CourseService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}