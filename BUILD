java_library(
    name = "java_test_deps",
    visibility = [
        "//src/test/com/fun/handlers:__pkg__",
        "//src/test/com/fun/messages:__pkg__",
    ],
    exports = [
        "@maven//:junit_junit",
        "@maven//:org_hamcrest_hamcrest_library",
        "@maven//:org_junit_jupiter_junit_jupiter_api",
        "@maven//:org_junit_platform_junit_platform_commons",
        "@maven//:org_mockito_mockito_core",
        "@maven//:org_mockito_mockito_inline",
        "@maven//:org_mockito_mockito_junit_jupiter",
    ],
)

java_library(
    name = "injection_deps",
    visibility = [
        "//src/main/com/fun/guiceexample:__pkg__",
    ],
    exports = [
        "@maven//:com_google_inject_guice",
    ],
)
