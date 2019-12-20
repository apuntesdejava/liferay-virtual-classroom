<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="init.jsp" %>

<% List<Course> courses=(List<Course>)renderRequest.getAttribute("courses");  %>

<p>
	 
	 
	 <liferay-portlet:renderURL var="newURL"  windowState="<%= LiferayWindowState.NORMAL.toString() %>" >
	 	<liferay-portlet:param name="mvcRenderCommandName" value="<%=ConstantsCommands.NEW_COURSE %>"/>
	 	<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
	 </liferay-portlet:renderURL>
	 <aui:button value="new" href="${newURL }"></aui:button> 
	 
	 <table>
	 	<thead>
	 		<tr>
	 			<th>Nombre</th>
	 			<th>Descripcion</th>
	 			<th>-</th>
	 		</tr>
	 	</thead>
	 	<tbody>
	 	<%for(Course course:courses){ %>
	 		<tr>
	 			<td><%= course.getName(locale) %> </td>
	 			<td><%= course.getDescription() %></td>
	 			<td>
	 				<liferay-portlet:renderURL var="editURL">
	 					<liferay-portlet:param name="mvcRenderCommandName" value="<%=ConstantsCommands.EDIT_COURSE %>"/>
	 					<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
	 					<liferay-portlet:param name="courseId" value="<%= String.valueOf(course.getCourseId()) %>"/>
	 				</liferay-portlet:renderURL>
	 			
	 				<liferay-ui:icon-menu> 						 				
	 					<liferay-ui:icon url="${editURL }"  message="edit" >
	 					 
	 					</liferay-ui:icon>
	 				</liferay-ui:icon-menu>
	 			</td>
	 		</tr>
	 		
	 	<%} %>
	 	</tbody>
	 </table>
</p>