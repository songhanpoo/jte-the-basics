jte{
    allow_scm_jenkinsfile = False
    permissive_initialization = True
    pipeline_template = "pipeline_config.groovy"
    reverse_library_resolution = True
}

@merge libraries{
    sonarqube
}
