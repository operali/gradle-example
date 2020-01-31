# Gradle-example


## Step by step
### install
- gradle 需要java环境
- gradle 解压后加入路径
- 命令行，测试 ```gradle```

### basic
> gradle init # 交互式初始化, 创建一个wrap\
> gradle tasks # 显示出所有task\
> gradle <task> # 执行特定task\
> [Task](https://guides.gradle.org/writing-gradle-tasks/)\
> [more about tasks](https://docs.gradle.org/6.0/userguide/tutorial_using_tasks.html)\
> [Custom Gradle Task Types](https://docs.gradle.org/6.0/userguide/custom_tasks.html#custom_tasks)


### kotlin jvm
> gradle init # 交互式建立 kotlin工程
> 添加国内源
```kotlin
repositories {
    maven { url = uri("http://maven.aliyun.com/nexus/content/groups/public/") }
    maven{ url = uri("http://maven.aliyun.com/nexus/content/repositories/jcenter") }
}
```
> // run\
> ```gradle build```\
> ```gradle test```


### [kotlin javascript](https://kotlinlang.org/docs/tutorials/javascript/getting-started-gradle/getting-started-with-gradle.html)


### [Getting Started](https://docs.gradle.org/current/userguide/getting_started.html) 
- [Five things](https://docs.gradle.org/current/userguide/what_is_gradle.html#five_things)
- projects, tasks, and the file API.

## FAQ
> gradle wrapper 是什么, 为何用gradlew 替代gradle?\
> 答： \
> 为了维护创建时的环境上下文，比如说用了什么版本的gradle, 依赖等情况\
> 用gradlew保证了执行创建时候的版本，与配置一致

> gradle 与 gradle.kts 如何转换
> 答：
```groovy
// groovy
//1 
apply plugin: "application"

//2 

```
```kotlin
// kotlin
//1 
apply {
   plugin("application")
}

//2 

```


## Reference

[official](https://gradle.org/)

[download](https://gradle.org/releases/)

[guides & document](https://gradle.org/guides/)

[get started](https://docs.gradle.org/current/userguide/getting_started.html)
