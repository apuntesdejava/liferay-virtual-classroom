<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="init.jsp" %>

<p>
	<b><liferay-ui:message key="course.caption"/></b>
	<h2>Hola a todos</h2>
	 
	 <liferay-portlet:renderURL var="editURL"  windowState="<%= LiferayWindowState.NORMAL.toString() %>" >
	 	<liferay-portlet:param name="mvcRenderCommandName" value="edit-course"/>
	 	<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
	 </liferay-portlet:renderURL>
	 
	 <aui:a href="<%= editURL %>">Editar</aui:a>
</p>