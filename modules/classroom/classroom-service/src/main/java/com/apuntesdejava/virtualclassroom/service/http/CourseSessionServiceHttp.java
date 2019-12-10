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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the HTTP utility for the
 * <code>CourseSessionServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionServiceSoap
 * @generated
 */
@ProviderType
public class CourseSessionServiceHttp {

	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			addCourseSession(
				HttpPrincipal httpPrincipal, String title, String description,
				long courseId, java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CourseSessionServiceUtil.class, "addCourseSession",
				_addCourseSessionParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, title, description, courseId, dueDate,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (com.apuntesdejava.virtualclassroom.model.CourseSession)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			updateCourseSession(
				HttpPrincipal httpPrincipal, long courseSessionId, String title,
				String description, java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CourseSessionServiceUtil.class, "updateCourseSession",
				_updateCourseSessionParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, courseSessionId, title, description, dueDate,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (com.apuntesdejava.virtualclassroom.model.CourseSession)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			HttpPrincipal httpPrincipal, long courseId) {

		try {
			MethodKey methodKey = new MethodKey(
				CourseSessionServiceUtil.class, "findByCourseId",
				_findByCourseIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, courseId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.apuntesdejava.virtualclassroom.model.CourseSession>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			HttpPrincipal httpPrincipal, long courseId, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				CourseSessionServiceUtil.class, "findByCourseId",
				_findByCourseIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, courseId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.apuntesdejava.virtualclassroom.model.CourseSession>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countByCourseId(
		HttpPrincipal httpPrincipal, long courseId) {

		try {
			MethodKey methodKey = new MethodKey(
				CourseSessionServiceUtil.class, "countByCourseId",
				_countByCourseIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, courseId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CourseSessionServiceHttp.class);

	private static final Class<?>[] _addCourseSessionParameterTypes0 =
		new Class[] {
			String.class, String.class, long.class, java.util.Date.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateCourseSessionParameterTypes1 =
		new Class[] {
			long.class, String.class, String.class, java.util.Date.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _findByCourseIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _findByCourseIdParameterTypes3 =
		new Class[] {long.class, int.class, int.class};
	private static final Class<?>[] _countByCourseIdParameterTypes4 =
		new Class[] {long.class};

}