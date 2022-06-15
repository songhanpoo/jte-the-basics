jte{
    allow_scm_jenkinsfile = true
    pipeline_template = "pipeline_config.groovy"
}

@merge libraries{
    sonarqube
}
