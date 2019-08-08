<%@ include file="init.jsp" %>
<liferay-ui:header title="course.edit" backURL="<%= backURL %>"></liferay-ui:header>  

<liferay-portlet:actionURL var="updateURL" name="/course/update">
	<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
</liferay-portlet:actionURL>

<aui:form action="<%= updateURL %>">
	<aui:input name="name" label="course.name" type="text" ></aui:input>
	
	<aui:button-row>
		<aui:button type="submit" value="save"></aui:button>
		<aui:button type="cancel" value="cancel" href="<%= backURL %>"></aui:button>
	</aui:button-row>
</aui:form>