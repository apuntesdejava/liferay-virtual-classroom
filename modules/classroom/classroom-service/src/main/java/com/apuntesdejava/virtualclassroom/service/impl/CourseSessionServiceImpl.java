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

import org.osgi.service.component.annotations.Component;

import com.apuntesdejava.virtualclassroom.model.CourseSession;
import com.apuntesdejava.virtualclassroom.service.base.CourseSessionServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the course session remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.apuntesdejava.virtualclassroom.service.CourseSessionService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=vc",
		"json.web.service.context.path=CourseSession"
	},
	service = AopService.class
)
public class CourseSessionServiceImpl extends CourseSessionServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.apuntesdejava.virtualclassroom.service.CourseSessionServiceUtil</code> to access the course session remote service.
	 */
	public CourseSession addCourseSession(String title, String description, long courseId, Date dueDate,
			ServiceContext serviceContext) throws PortalException {
		 

		return courseSessionLocalService.addCourseSession(title,description,courseId,dueDate,serviceContext);
	}

	public CourseSession updateCourseSession(long courseSessionId, String title, String description, Date dueDate,
			ServiceContext serviceContext) throws PortalException {
		 
		return courseSessionLocalService.updateCourseSession(courseSessionId,title,description,dueDate,serviceContext);
	}

	public List<CourseSession> findByCourseId(long courseId) {
		return courseSessionLocalService.findByCourseId(courseId);
	}

	public List<CourseSession> findByCourseId(long courseId, int start, int end) {
		return courseSessionLocalService.findByCourseId(courseId, start, end);
	}

	public int countByCourseId(long courseId) { 
		return courseSessionLocalService.countByCourseId(courseId);
	}
}