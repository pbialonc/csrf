# csrf
CSRF issue

shouldReturnTeapot fails as execution returns 400 which is defined in defaultAccessDenied handler

Note that not defining accessDeniedHandler would not cause defaultAccessDeniedHandlerFor to take effect, it would be still omitted.

