package com.apuntesdejava.virtualclassroom.course.portlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.apuntesdejava.virtualclassroom.course.constants.CoursePortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

@Component(
		immediate = true,
		property = {
			 
			"javax.portlet.name=" + CoursePortletKeys.COURSE, 
			"mvc.command.name=edit-course"
		},
		service = MVCRenderCommand.class
	)
public class CourseEditMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		 
		return "/edit.jsp";
	}

}
