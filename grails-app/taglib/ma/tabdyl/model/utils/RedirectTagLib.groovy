package ma.tabdyl.model.utils

class RedirectTagLib {
    def redirectToHomePage = {
      response.sendRedirect("${request.contextPath}/index.html")
    }
}
