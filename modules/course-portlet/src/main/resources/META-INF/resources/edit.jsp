<%@ include file="init.jsp" %>
<liferay-ui:header title="course.edit" backURL="<%= backURL %>"></liferay-ui:header>  

<liferay-portlet:actionURL var="updateURL" name="<%=ConstantsCommands.UPDATE_COURSE %>">
	<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
</liferay-portlet:actionURL>
<%Course course=  (Course)renderRequest.getAttribute("course") ; %>
<aui:form action="${updateURL }">
	<aui:model-context bean="<%=course %>" model="<%=Course.class %>"></aui:model-context>
	<aui:input name="courseId" type="hidden"></aui:input>
	<aui:input name="name" label="course.name"   ></aui:input>
	<aui:input name="description"   ></aui:input>
	
	<aui:button-row>
		<aui:button type="submit" value="save"></aui:button>
		<aui:button type="cancel" value="cancel" href="<%= backURL %>"></aui:button>
	</aui:button-row>
</aui:form>