package com.apuntesdejava.virtualclassroom.course.portlet;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.apuntesdejava.virtualclassroom.course.constants.CoursePortletKeys;
import com.apuntesdejava.virtualclassroom.model.Course;
import com.apuntesdejava.virtualclassroom.service.CourseService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
@Component(
		immediate = true,
		property = {
			 
			"javax.portlet.name=" + CoursePortletKeys.COURSE, 
			"mvc.command.name=/"
		},
		service = MVCRenderCommand.class
	)
public class CourseListMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId=themeDisplay.getScopeGroupId();
		List<Course> courses = _courseService.findByGroupId(groupId);
		renderRequest.setAttribute("courses", courses	);
		return null;
	}
	private static final Log _log=LogFactoryUtil.getLog(CourseListMVCRenderCommand.class);
	
	@Reference
	private CourseService _courseService;
}
