package com.apuntesdejava.virtualclassroom.course.portlet;

import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.apuntesdejava.virtualclassroom.course.constants.CoursePortletKeys;
import com.apuntesdejava.virtualclassroom.service.CourseService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
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
		
		try {
			long courseId=ParamUtil.getLong(actionRequest, "courseId");
			
			Map<Locale, String> name = LocalizationUtil.getLocalizationMap(actionRequest, "name");
			String description=ParamUtil.getString(actionRequest, "description");

			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long groupId=themeDisplay.getScopeGroupId();
			ServiceContext serviceContext;
			serviceContext = ServiceContextFactory.getInstance(actionRequest);
			if (courseId==0)
				_courseService.addCourse(groupId, name, description, serviceContext);
			else
				_courseService.updateCourse(courseId, name, description, serviceContext);
			return true;
		} catch (PortalException e) {
			_log.error(e);
		}
		return false;
		 
	}
	
	private static final Log _log=LogFactoryUtil.getLog(CourseUpdateMVCActionCommand.class);
	
	@Reference
	private CourseService _courseService;

}
