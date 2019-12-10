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

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.apuntesdejava.virtualclassroom.model.Course;
import com.apuntesdejava.virtualclassroom.service.base.CourseServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * The implementation of the course remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.apuntesdejava.virtualclassroom.service.CourseService</code>
 * interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseServiceBaseImpl
 */
@Component(
		property = 
			{	"json.web.service.context.name=vc",
				"json.web.service.context.path=Course" 
			}, 
		service = AopService.class
)
public class CourseServiceImpl extends CourseServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.apuntesdejava.virtualclassroom.service.CourseServiceUtil</code> to
	 * access the course remote service.
	 */

	public Course addCourse(long groupId, Map<Locale, String> name, String description, ServiceContext serviceContext)
			throws PortalException {
		return courseLocalService.addCourse(groupId, name, description, serviceContext);
	}

	public Course updateCourse(long courseId, Map<Locale, String> name, String description,
			ServiceContext serviceContext) throws PortalException {
		return courseLocalService.updateCourse(courseId, name, description, serviceContext);
	}

	public List<Course> findByGroupId(long groupId) {
		return courseLocalService.findByGroupId(groupId);
	}

	public List<Course> findByUserId(long userId) {
		return courseLocalService.findByUserId(userId);
	}

	public List<Course> findByUserId(long userId, int start, int end) {
		return courseLocalService.findByUserId(userId, start, end);
	}

	public int countByUserId(long userId) {
		return courseLocalService.countByUserId(userId);
	}
	
	public List<Course> findByGroupId(long groupId, int start, int end) {
		return courseLocalService.findByGroupId(groupId, start, end);
	}

	public int countByGroupId(long groupId) {
		return courseLocalService.countByGroupId(groupId);
	}

	public List<Course> findByU_G(long userId, long groupId) { 
		return courseLocalService.findByU_G(userId, groupId);
	}

	public List<Course> findByU_G(long userId, long groupId, int start, int end) {
		return courseLocalService.findByU_G(userId, groupId, start, end);
	}

	public int countByU_G(long userId, long groupId) {
		return courseLocalService.countByU_G(userId, groupId);
	}
	
	public List<Course> findByKeywords(long groupId,String keywords, int start, int end, OrderByComparator<Course> orderByComparator){
		return courseLocalService.findByKeywords(groupId, keywords, start, end, orderByComparator);
	}
	public Course deleteCourse(long courseId) throws PortalException {
		return courseLocalService.deleteCourse(courseId);
	}
	public Course fetchCourse(long courseId) {
		return courseLocalService.fetchCourse(courseId);
	}
	 
}