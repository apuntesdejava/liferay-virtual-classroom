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

import com.apuntesdejava.virtualclassroom.exception.NoSuchCourseSessionException;
import com.apuntesdejava.virtualclassroom.model.CourseSession;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the course session service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionUtil
 * @generated
 */
@ProviderType
public interface CourseSessionPersistence
	extends BasePersistence<CourseSession> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CourseSessionUtil} to access the course session persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the course sessions where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the matching course sessions
	 */
	public java.util.List<CourseSession> findByCourseId(long courseId);

	/**
	 * Returns a range of all the course sessions where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @return the range of matching course sessions
	 */
	public java.util.List<CourseSession> findByCourseId(
		long courseId, int start, int end);

	/**
	 * Returns an ordered range of all the course sessions where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByCourseId(long, int, int, OrderByComparator)}
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching course sessions
	 */
	@Deprecated
	public java.util.List<CourseSession> findByCourseId(
		long courseId, int start, int end,
		OrderByComparator<CourseSession> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the course sessions where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course sessions
	 */
	public java.util.List<CourseSession> findByCourseId(
		long courseId, int start, int end,
		OrderByComparator<CourseSession> orderByComparator);

	/**
	 * Returns the first course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course session
	 * @throws NoSuchCourseSessionException if a matching course session could not be found
	 */
	public CourseSession findByCourseId_First(
			long courseId, OrderByComparator<CourseSession> orderByComparator)
		throws NoSuchCourseSessionException;

	/**
	 * Returns the first course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course session, or <code>null</code> if a matching course session could not be found
	 */
	public CourseSession fetchByCourseId_First(
		long courseId, OrderByComparator<CourseSession> orderByComparator);

	/**
	 * Returns the last course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course session
	 * @throws NoSuchCourseSessionException if a matching course session could not be found
	 */
	public CourseSession findByCourseId_Last(
			long courseId, OrderByComparator<CourseSession> orderByComparator)
		throws NoSuchCourseSessionException;

	/**
	 * Returns the last course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course session, or <code>null</code> if a matching course session could not be found
	 */
	public CourseSession fetchByCourseId_Last(
		long courseId, OrderByComparator<CourseSession> orderByComparator);

	/**
	 * Returns the course sessions before and after the current course session in the ordered set where courseId = &#63;.
	 *
	 * @param courseSessionId the primary key of the current course session
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course session
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	public CourseSession[] findByCourseId_PrevAndNext(
			long courseSessionId, long courseId,
			OrderByComparator<CourseSession> orderByComparator)
		throws NoSuchCourseSessionException;

	/**
	 * Removes all the course sessions where courseId = &#63; from the database.
	 *
	 * @param courseId the course ID
	 */
	public void removeByCourseId(long courseId);

	/**
	 * Returns the number of course sessions where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the number of matching course sessions
	 */
	public int countByCourseId(long courseId);

	/**
	 * Caches the course session in the entity cache if it is enabled.
	 *
	 * @param courseSession the course session
	 */
	public void cacheResult(CourseSession courseSession);

	/**
	 * Caches the course sessions in the entity cache if it is enabled.
	 *
	 * @param courseSessions the course sessions
	 */
	public void cacheResult(java.util.List<CourseSession> courseSessions);

	/**
	 * Creates a new course session with the primary key. Does not add the course session to the database.
	 *
	 * @param courseSessionId the primary key for the new course session
	 * @return the new course session
	 */
	public CourseSession create(long courseSessionId);

	/**
	 * Removes the course session with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session that was removed
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	public CourseSession remove(long courseSessionId)
		throws NoSuchCourseSessionException;

	public CourseSession updateImpl(CourseSession courseSession);

	/**
	 * Returns the course session with the primary key or throws a <code>NoSuchCourseSessionException</code> if it could not be found.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session
	 * @throws NoSuchCourseSessionException if a course session with the primary key could not be found
	 */
	public CourseSession findByPrimaryKey(long courseSessionId)
		throws NoSuchCourseSessionException;

	/**
	 * Returns the course session with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param courseSessionId the primary key of the course session
	 * @return the course session, or <code>null</code> if a course session with the primary key could not be found
	 */
	public CourseSession fetchByPrimaryKey(long courseSessionId);

	/**
	 * Returns all the course sessions.
	 *
	 * @return the course sessions
	 */
	public java.util.List<CourseSession> findAll();

	/**
	 * Returns a range of all the course sessions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @return the range of course sessions
	 */
	public java.util.List<CourseSession> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the course sessions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of course sessions
	 */
	@Deprecated
	public java.util.List<CourseSession> findAll(
		int start, int end, OrderByComparator<CourseSession> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the course sessions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CourseSessionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course sessions
	 * @param end the upper bound of the range of course sessions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of course sessions
	 */
	public java.util.List<CourseSession> findAll(
		int start, int end, OrderByComparator<CourseSession> orderByComparator);

	/**
	 * Removes all the course sessions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of course sessions.
	 *
	 * @return the number of course sessions
	 */
	public int countAll();

}