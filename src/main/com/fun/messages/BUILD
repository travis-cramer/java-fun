java_library(
    name = "messages",
    srcs = glob(["*.java"]),
    visibility = [
        "//src/main/com/fun/handlers:__pkg__",
        "//src/main/com/fun/server:__pkg__",
        "//src/test/com/fun/handlers:__pkg__",
        "//src/test/com/fun/messages:__pkg__",
    ],
)

java_binary(
    name = "testMessages",
    srcs = glob(["*.java"]),
    main_class = "src.messages.MessageTest",
)
