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

import com.apuntesdejava.virtualclassroom.model.Course;
import com.apuntesdejava.virtualclassroom.model.CourseSession;
import com.apuntesdejava.virtualclassroom.service.base.CourseSessionLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the course session local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.apuntesdejava.virtualclassroom.service.CourseSessionLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.apuntesdejava.virtualclassroom.model.CourseSession", service = AopService.class)
public class CourseSessionLocalServiceImpl extends CourseSessionLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.apuntesdejava.virtualclassroom.service.CourseSessionLocalService</
	 * code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or
	 * use <code>com.apuntesdejava.virtualclassroom.service.
	 * CourseSessionLocalServiceUtil</code>.
	 */
	public CourseSession addCourseSession(String title, String description, long courseId, Date dueDate,
			ServiceContext serviceContext) throws PortalException {
		long userId = serviceContext.getUserId();
		Course course = coursePersistence.fetchByPrimaryKey(courseId); // para obtener el curso y que exista
		User user = userLocalService.getUser(userId);
		long courseSessionId = counterLocalService.increment(CourseSession.class.getName());
		CourseSession courseSession = createCourseSession(courseSessionId);
		courseSession.setCompanyId(serviceContext.getCompanyId());
		courseSession.setCourseId(courseId);
		courseSession.setGroupId(course.getGroupId());
		courseSession.setUserName(user.getScreenName());
		courseSession.setDescription(description);
		courseSession.setTitle(title);
		courseSession.setCreateDate(serviceContext.getCreateDate(new Date()));

		return addCourseSession(courseSession);
	}

	public CourseSession updateCourseSession(long courseSessionId, String title, String description, Date dueDate,
			ServiceContext serviceContext) throws PortalException {
		CourseSession courseSession = getCourseSession(courseSessionId);
		courseSession.setTitle(title);
		courseSession.setDescription(description);
		courseSession.setDueDate(dueDate);
		courseSession.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		return updateCourseSession(courseSession);
	}

	public List<CourseSession> findByCourseId(long courseId) {
		return courseSessionPersistence.findByCourseId(courseId);
	}

	public List<CourseSession> findByCourseId(long courseId, int start, int end) {
		return courseSessionPersistence.findByCourseId(courseId, start, end);
	}

	public int countByCourseId(long courseId) {
		return courseSessionPersistence.countByCourseId(courseId);
	}
}