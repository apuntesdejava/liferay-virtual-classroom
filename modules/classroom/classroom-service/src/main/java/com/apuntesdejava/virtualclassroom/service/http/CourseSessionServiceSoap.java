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

package com.apuntesdejava.virtualclassroom.service.http;

import com.apuntesdejava.virtualclassroom.service.CourseSessionServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the SOAP utility for the
 * <code>CourseSessionServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.apuntesdejava.virtualclassroom.model.CourseSessionSoap</code>. If the method in the
 * service utility returns a
 * <code>com.apuntesdejava.virtualclassroom.model.CourseSession</code>, that is translated to a
 * <code>com.apuntesdejava.virtualclassroom.model.CourseSessionSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionServiceHttp
 * @generated
 */
@ProviderType
public class CourseSessionServiceSoap {

	public static com.apuntesdejava.virtualclassroom.model.CourseSessionSoap
			addCourseSession(
				String title, String description, long courseId,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.apuntesdejava.virtualclassroom.model.CourseSession returnValue =
				CourseSessionServiceUtil.addCourseSession(
					title, description, courseId, dueDate, serviceContext);

			return com.apuntesdejava.virtualclassroom.model.CourseSessionSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSessionSoap
			updateCourseSession(
				long courseSessionId, String title, String description,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.apuntesdejava.virtualclassroom.model.CourseSession returnValue =
				CourseSessionServiceUtil.updateCourseSession(
					courseSessionId, title, description, dueDate,
					serviceContext);

			return com.apuntesdejava.virtualclassroom.model.CourseSessionSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSessionSoap[]
			findByCourseId(long courseId)
		throws RemoteException {

		try {
			java.util.List
				<com.apuntesdejava.virtualclassroom.model.CourseSession>
					returnValue = CourseSessionServiceUtil.findByCourseId(
						courseId);

			return com.apuntesdejava.virtualclassroom.model.CourseSessionSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSessionSoap[]
			findByCourseId(long courseId, int start, int end)
		throws RemoteException {

		try {
			java.util.List
				<com.apuntesdejava.virtualclassroom.model.CourseSession>
					returnValue = CourseSessionServiceUtil.findByCourseId(
						courseId, start, end);

			return com.apuntesdejava.virtualclassroom.model.CourseSessionSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByCourseId(long courseId) throws RemoteException {
		try {
			int returnValue = CourseSessionServiceUtil.countByCourseId(
				courseId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CourseSessionServiceSoap.class);

}