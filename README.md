
# Calory Tracker

Caroly Tracker app is built with Jetpack Compose UI toolkit. It uses libraries from Jetpack (like Hilt, ViewModels, Room, Navigation) and also other 3rd party libraries like Retrofit for network request, Coil to load images from the network, Mockk to mock classes and webservice when testing the app. 

The app is a practical course from Philips Lackner, here is the [link](https://pl-coding.com/multi-module-course/). It teaches best practices and tricks to build complex applications like a multimodular app.




## Topics covered and documentation

Jetpack Compose UI concepts like 
- [Recomposition](https://developer.android.com/jetpack/compose/mental-model#recomposition), 
- [State](https://developer.android.com/jetpack/compose/state), 
- [Navigation](https://developer.android.com/jetpack/compose/navigation)
- [App architecture](https://developer.android.com/topic/architecture) and [Compose architecture](https://developer.android.com/jetpack/compose/architecture) following an unidirectional data flow (UDF) pattern
- [Animations](https://developer.android.com/jetpack/compose/animation/introduction). Use of Animatable and LaunchEffect
- [Canvas](https://developer.android.com/jetpack/compose/graphics/draw/overview) to create custom views and shapes along with Animations.
- [Test](https://developer.android.com/jetpack/compose/testing): UnitTest, test uses case with [MockWebServer](https://github.com/square/okhttp/tree/master/mockwebserver), Instrumented Tests, End to End test.

## Authors

- [@AdrianJPerez](https://www.github.com/adrianpbv)

- [@PhilippLackner](https://www.github.com/philipplackner)
## 🛠 Skills
Android Studio, Jetpack Compose, Kotlin, TDD (Architecture, Unit test, Instrumented test, End to End test), Debugging, Layout Inspector, Git, Postman.


## API Reference

#### Get all food items

```http
  GET https://us.openfoodfacts.org/cgi/search.pl?search_simple=1&json=1&action=process&fields=product_name,nutriments,image_front_thumb_url
```


