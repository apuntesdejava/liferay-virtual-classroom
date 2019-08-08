package com.apuntesdejava.virtualclassroom.course.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.apuntesdejava.virtualclassroom.course.constants.CoursePortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
@Component(
		immediate = true,
		property = {
			 
			"javax.portlet.name=" + CoursePortletKeys.COURSE,  
			"mvc.command.name=/course/update"
		},
		service = MVCActionCommand.class
	)
public class CourseUpdateMVCActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		String courseName = ParamUtil.getString(actionRequest, "name");
		_log.info("nombre del curso:"+courseName);
		return true;
	}
	
	private static final Log _log=LogFactoryUtil.getLog(CourseUpdateMVCActionCommand.class);

}
