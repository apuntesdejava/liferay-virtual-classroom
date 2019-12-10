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

import com.apuntesdejava.virtualclassroom.model.Course;

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
 * The persistence utility for the course service. This utility wraps <code>com.apuntesdejava.virtualclassroom.service.persistence.impl.CoursePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CoursePersistence
 * @generated
 */
@ProviderType
public class CourseUtil {

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
	public static void clearCache(Course course) {
		getPersistence().clearCache(course);
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
	public static Map<Serializable, Course> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Course> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Course> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Course> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Course> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Course update(Course course) {
		return getPersistence().update(course);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Course update(Course course, ServiceContext serviceContext) {
		return getPersistence().update(course, serviceContext);
	}

	/**
	 * Returns all the courses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching courses
	 */
	public static List<Course> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the courses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of matching courses
	 */
	public static List<Course> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the courses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUserId(long, int, int, OrderByComparator)}
	 * @param userId the user ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching courses
	 */
	@Deprecated
	public static List<Course> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Course> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the courses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching courses
	 */
	public static List<Course> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Course> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns the first course in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public static Course findByUserId_First(
			long userId, OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first course in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course, or <code>null</code> if a matching course could not be found
	 */
	public static Course fetchByUserId_First(
		long userId, OrderByComparator<Course> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last course in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public static Course findByUserId_Last(
			long userId, OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last course in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course, or <code>null</code> if a matching course could not be found
	 */
	public static Course fetchByUserId_Last(
		long userId, OrderByComparator<Course> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the courses before and after the current course in the ordered set where userId = &#63;.
	 *
	 * @param courseId the primary key of the current course
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public static Course[] findByUserId_PrevAndNext(
			long courseId, long userId,
			OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByUserId_PrevAndNext(
			courseId, userId, orderByComparator);
	}

	/**
	 * Removes all the courses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of courses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching courses
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the courses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching courses
	 */
	public static List<Course> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the courses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of matching courses
	 */
	public static List<Course> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the courses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching courses
	 */
	@Deprecated
	public static List<Course> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Course> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the courses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching courses
	 */
	public static List<Course> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Course> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first course in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public static Course findByGroupId_First(
			long groupId, OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first course in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course, or <code>null</code> if a matching course could not be found
	 */
	public static Course fetchByGroupId_First(
		long groupId, OrderByComparator<Course> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last course in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public static Course findByGroupId_Last(
			long groupId, OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last course in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course, or <code>null</code> if a matching course could not be found
	 */
	public static Course fetchByGroupId_Last(
		long groupId, OrderByComparator<Course> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the courses before and after the current course in the ordered set where groupId = &#63;.
	 *
	 * @param courseId the primary key of the current course
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public static Course[] findByGroupId_PrevAndNext(
			long courseId, long groupId,
			OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByGroupId_PrevAndNext(
			courseId, groupId, orderByComparator);
	}

	/**
	 * Removes all the courses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of courses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching courses
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the courses where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the matching courses
	 */
	public static List<Course> findByU_G(long userId, long groupId) {
		return getPersistence().findByU_G(userId, groupId);
	}

	/**
	 * Returns a range of all the courses where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of matching courses
	 */
	public static List<Course> findByU_G(
		long userId, long groupId, int start, int end) {

		return getPersistence().findByU_G(userId, groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the courses where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByU_G(long,long, int, int, OrderByComparator)}
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching courses
	 */
	@Deprecated
	public static List<Course> findByU_G(
		long userId, long groupId, int start, int end,
		OrderByComparator<Course> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByU_G(
			userId, groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the courses where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching courses
	 */
	public static List<Course> findByU_G(
		long userId, long groupId, int start, int end,
		OrderByComparator<Course> orderByComparator) {

		return getPersistence().findByU_G(
			userId, groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the first course in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public static Course findByU_G_First(
			long userId, long groupId,
			OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByU_G_First(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the first course in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course, or <code>null</code> if a matching course could not be found
	 */
	public static Course fetchByU_G_First(
		long userId, long groupId,
		OrderByComparator<Course> orderByComparator) {

		return getPersistence().fetchByU_G_First(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the last course in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course
	 * @throws NoSuchCourseException if a matching course could not be found
	 */
	public static Course findByU_G_Last(
			long userId, long groupId,
			OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByU_G_Last(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the last course in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course, or <code>null</code> if a matching course could not be found
	 */
	public static Course fetchByU_G_Last(
		long userId, long groupId,
		OrderByComparator<Course> orderByComparator) {

		return getPersistence().fetchByU_G_Last(
			userId, groupId, orderByComparator);
	}

	/**
	 * Returns the courses before and after the current course in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param courseId the primary key of the current course
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public static Course[] findByU_G_PrevAndNext(
			long courseId, long userId, long groupId,
			OrderByComparator<Course> orderByComparator)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByU_G_PrevAndNext(
			courseId, userId, groupId, orderByComparator);
	}

	/**
	 * Removes all the courses where userId = &#63; and groupId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 */
	public static void removeByU_G(long userId, long groupId) {
		getPersistence().removeByU_G(userId, groupId);
	}

	/**
	 * Returns the number of courses where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the number of matching courses
	 */
	public static int countByU_G(long userId, long groupId) {
		return getPersistence().countByU_G(userId, groupId);
	}

	/**
	 * Caches the course in the entity cache if it is enabled.
	 *
	 * @param course the course
	 */
	public static void cacheResult(Course course) {
		getPersistence().cacheResult(course);
	}

	/**
	 * Caches the courses in the entity cache if it is enabled.
	 *
	 * @param courses the courses
	 */
	public static void cacheResult(List<Course> courses) {
		getPersistence().cacheResult(courses);
	}

	/**
	 * Creates a new course with the primary key. Does not add the course to the database.
	 *
	 * @param courseId the primary key for the new course
	 * @return the new course
	 */
	public static Course create(long courseId) {
		return getPersistence().create(courseId);
	}

	/**
	 * Removes the course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseId the primary key of the course
	 * @return the course that was removed
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public static Course remove(long courseId)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().remove(courseId);
	}

	public static Course updateImpl(Course course) {
		return getPersistence().updateImpl(course);
	}

	/**
	 * Returns the course with the primary key or throws a <code>NoSuchCourseException</code> if it could not be found.
	 *
	 * @param courseId the primary key of the course
	 * @return the course
	 * @throws NoSuchCourseException if a course with the primary key could not be found
	 */
	public static Course findByPrimaryKey(long courseId)
		throws com.apuntesdejava.virtualclassroom.exception.
			NoSuchCourseException {

		return getPersistence().findByPrimaryKey(courseId);
	}

	/**
	 * Returns the course with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param courseId the primary key of the course
	 * @return the course, or <code>null</code> if a course with the primary key could not be found
	 */
	public static Course fetchByPrimaryKey(long courseId) {
		return getPersistence().fetchByPrimaryKey(courseId);
	}

	/**
	 * Returns all the courses.
	 *
	 * @return the courses
	 */
	public static List<Course> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of courses
	 */
	public static List<Course> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of courses
	 */
	@Deprecated
	public static List<Course> findAll(
		int start, int end, OrderByComparator<Course> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of courses
	 */
	public static List<Course> findAll(
		int start, int end, OrderByComparator<Course> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the courses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of courses.
	 *
	 * @return the number of courses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CoursePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CoursePersistence, CoursePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CoursePersistence.class);

		ServiceTracker<CoursePersistence, CoursePersistence> serviceTracker =
			new ServiceTracker<CoursePersistence, CoursePersistence>(
				bundle.getBundleContext(), CoursePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}