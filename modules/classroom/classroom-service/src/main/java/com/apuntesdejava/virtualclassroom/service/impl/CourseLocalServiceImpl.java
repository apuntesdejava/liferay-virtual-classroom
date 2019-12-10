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

package com.apuntesdejava.virtualclassroom.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.apuntesdejava.virtualclassroom.model.Course;
import com.apuntesdejava.virtualclassroom.service.base.CourseLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the course local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.apuntesdejava.virtualclassroom.service.CourseLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.apuntesdejava.virtualclassroom.model.Course", service = AopService.class)
public class CourseLocalServiceImpl extends CourseLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.apuntesdejava.virtualclassroom.service.CourseLocalService</code>
	 * via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.apuntesdejava.virtualclassroom.service.CourseLocalServiceUtil</code
	 * >.
	 */
 

	public Course addCourse(long groupId, Map<Locale, String> name, String description, ServiceContext serviceContext)
			throws PortalException {
		long courseId = counterLocalService.increment(Course.class.getName());
		Course course = super.createCourse(courseId);
		course.setGroupId(groupId);
		course.setNameMap(name);
		course.setCompanyId(serviceContext.getCompanyId());
		course.setDescription(description);
		course.setUserId(serviceContext.getUserId());
		User user = userLocalService.getUser(serviceContext.getUserId());
		course.setUserName(user.getScreenName());
		course.setCreateDate(serviceContext.getCreateDate(new Date()));
		return super.addCourse(course);

	}

	public Course updateCourse(long courseId, Map<Locale, String> name, String description,
			ServiceContext serviceContext) throws PortalException {
		Course course = getCourse(courseId);
		course.setNameMap(name);
		course.setDescription(description);
		course.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		return updateCourse(course);
	}

	public List<Course> findByUserId(long userId) {
		return coursePersistence.findByUserId(userId);
	}

	public List<Course> findByUserId(long userId, int start, int end) {
		return coursePersistence.findByUserId(userId, start, end);
	}

	public int countByUserId(long userId) {
		return coursePersistence.countByUserId(userId);
	}

	public List<Course> findByGroupId(long groupId) {
		return coursePersistence.findByGroupId(groupId);
	}

	public List<Course> findByGroupId(long groupId, int start,int end) {
		return coursePersistence.findByGroupId(groupId, start, end);
	}

	public int countByGroupId(long groupId) {
		return coursePersistence.countByGroupId(groupId);
	}

	public List<Course> findByU_G(long userId, long groupId) {
		return coursePersistence.findByU_G(userId, groupId);
	}

	public List<Course> findByU_G(long userId, long groupId, int start, int end) {
		return coursePersistence.findByU_G(userId, groupId, start, end);
	}

	public int countByU_G(long userId, long groupId) {
		return coursePersistence.countByU_G(userId, groupId);
	}
	
	public List<Course> findByKeywords(long groupId,String keywords, int start, int end, OrderByComparator<Course> orderByComparator){
		DynamicQuery query = dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));
		if (Validator.isNotNull(keywords)) {
			 Junction disjunction = RestrictionsFactoryUtil.disjunction()
					.add(
							RestrictionsFactoryUtil.like("name",'%'+ keywords+'%')
					).add(
							RestrictionsFactoryUtil.like("description",'%'+ keywords+'%')
					);
			 query.add(disjunction);
		}
		return dynamicQuery(query, start, end, orderByComparator);
	}
	

}