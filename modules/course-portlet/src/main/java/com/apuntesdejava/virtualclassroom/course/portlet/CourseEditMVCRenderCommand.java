package com.apuntesdejava.virtualclassroom.course.portlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.apuntesdejava.virtualclassroom.course.constants.ConstantsCommands;
import com.apuntesdejava.virtualclassroom.course.constants.CoursePortletKeys;
import com.apuntesdejava.virtualclassroom.model.Course;
import com.apuntesdejava.virtualclassroom.service.CourseService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
		immediate = true,
		property = {
			 
			"javax.portlet.name=" + CoursePortletKeys.COURSE, 
			"mvc.command.name="+ConstantsCommands.NEW_COURSE,
			"mvc.command.name="+ConstantsCommands.EDIT_COURSE
		},
		service = MVCRenderCommand.class
	)
public class CourseEditMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		long courseId = ParamUtil.getLong(renderRequest, "courseId"); 
		if (courseId>0) {
			Course course = _courseService.fetchCourse(courseId);
			renderRequest.setAttribute("course", course);
		}
		return "/edit.jsp";
	}

	private static final Log _log=LogFactoryUtil.getLog(CourseEditMVCRenderCommand.class);
	
	@Reference
	private CourseService _courseService;
}
