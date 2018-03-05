package com.designpattern.factory;
/*
 * 定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类
 * 类型：创建类模式
 * 分类：简单工厂模式(也叫静态工厂模式)、工厂方法模式、抽象工厂模式
 */

/*
 * 优点：
 * 可以使代码接口清晰，有效的封装变化，在编程中，产品的实例化有时候是比较复杂的，通过工厂模式，将产品的实例化封装起来，使调用者根本无需关系产品的实例化过程，只需依赖工厂即可得到自己想要的产品。
 * 对调用者屏蔽具体的产品类。如果使用工厂模式，调用者只关心产品的接口就可以了，至于具体的实现，调用者根本无需关心。即使变成了具体的实现，对调用者来说没有任何影响。
 * 降低耦合度。产品类的实例化通常来说是很复杂的，它需要依赖很多的类，而这些类对于调用者来说根本无需知道，如果使用了工厂方法，我们需要做的仅仅是实例化好产品类，然后交给调用者使用。对调用者来说，产品所依赖的类都是透明的。
 */

/*
 * 要素：
 * 工厂接口。工厂接口是工厂方法的核心，与调用者直接交互用来提供产品。在实际编程中，有时候也会使用一个抽象类来作为与调用者交互的接口，其本质上是一样的。
 * 工厂实现。在编程中，工厂实现决定如何实例化产品，是实现扩展的途径，需要有多少种产品，就需要就多少个具体的工厂实现。
 * 产品接口。产品接口的主要目的是定义产品的规范，所有的产品实现都必须遵循产品接口定义的规范。产品接口是调用者最为关心的，产品接口定义的优劣直接决定了调用者代码的稳定性，同样，产品接口也可以用抽象类来代替，但要注意最好不要违反里氏替换原则。
 * 产品实现。实现产品接口的具体类，决定了产品在客户端中的具体行为。
 */

/*
 * 适用场景：
 * 首先，作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过new就可以完成的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 * 其次，工厂模式是一种典型的解耦模式，迪米特法则在工厂模式中表现的尤为明显。加入调用者自己组装产品需要增加依赖关系时，可以考虑使用工厂模式。将会大大降低对象之间的耦合度。
 * 再次，由于工厂模式是依靠抽象结构的，它把实例化产品的任务交由实现类完成，扩展性比较好。也就是说，当需要系统有比较好的扩展性时，可以考虑工厂模式，不同的产品用不同的实现工厂来组装。
 */

/*
 * 抽象工厂模式与工厂方法模式的区别：
 * 抽象工厂模式是工厂方法模式的升级版本，它用来创建一组或者相互依赖的对象。它与工厂方法模式的区别就在于，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则是针对的多个产品等级结构。
 * 在编程中，通常一个产品结构，表现为一个接口或者抽象类，也就是说，工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，而抽象工厂模式所提供的产品则是衍生自不同的接口或抽象类
 * 在抽象工厂模式中，有一个产品族的概念：所谓的产品族，是指位于不同产品等级结构中功能相关联的产品组成的家族。
 * 抽象工厂模式所提供的一些列产品就组成一个产品族；而工厂方法提供的一系列产品成为一个等级结构。
 */

/*
 * 总结：
 * 无论是简单工厂模式、工厂方法模式、还是抽象工厂模式，他们都属于工厂模式，在形式和特点上也是极为相似的，他们的最终目的都是解耦。
 * 在使用时，我们不必去在意这个模式到底工厂方法模式还是抽象工厂模式，因为他们之间的演变常常是令人琢磨不透的。
 * 经常你会发现，明明使用的是工厂方法模式，当新需求来临，稍加修改，加入一个新方法后，由于类中的产品构成了不同等级结构中的产品族，它就变成了抽象工厂模式了；
 * 而对于抽象工厂模式，当减少一个方法是的提供的产品不再构成产品族之后，它就演变成了工厂方法模式。
 * 所以，在使用工程模式时，只需要关心降低耦合度的目的是否达到了。
 */