package ma.tabdyl.redirect

class RedirectTagLib {
    def redirectToHomePage = {
      response.sendRedirect("${request.contextPath}/index.html")
    }
}
