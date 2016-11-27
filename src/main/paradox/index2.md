# `Source` introduction

## Summary of this article 

* `Source` examples to generate `Int` elements
* `runForeach` with a callback function
* `Source(List(...))` doesn't emit its `List` as a whole, but emits `Int` one by one 

## Source code in this artidle

```
implicit val system = ActorSystem()
implicit val materializer = ActorMaterializer()

val sourceFromSingle = Source.single(1)
sourceFromSingle runForeach{ i => println(i) }

val sourceFromRange = Source(1 to 5)
sourceFromRange runForeach{ i => println(i) }

val sourceFromIterable = Source(List(1,2,3))
sourceFromIterable runForeach{ i => println(i) }

Thread.sleep(1000)
system.terminate()
```

## `Source` introduction 

To use Akka Stream, you typically declare `ActorSystem` and `ActorMaterializer` like below.
 

```
implicit val system = ActorSystem()
implicit val materializer = ActorMaterializer()
```

In production, you'd need [configuration](http://doc.akka.io/docs/akka/current/general/stream/stream-configuration.html) to set up `ActorSystem` and `ActorMaterializer` properly. 
However, we don't supply configuration in this tutorial.

```
val sourceFromSingle = Source.single(1)
```

<img style="display: block; margin: 20px auto;" src="img/Source Single 1.png" width="150px">

```
sourceFromSingle runForeach{ i => println(i) }
```

<img style="display: block; margin: 20px auto;" src="img/SourceSingle.png" width="300px">

## `Source` from Scala collection

```
val sourceFromRange = Source(1 to 5)
```

```
scala> 1 to 5
res0: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5)
```

```
sourceFromRange runForeach{ i => println(i) }
```


<div style="width: 100%; text-align: center;">
  <iframe src="https://vine.co/v/5FTYmEWmXPW/embed/simple" width="300" height="300" frameborder="0"></iframe><script src="https://platform.vine.co/static/scripts/embed.js"></script>
</div>

```
val sourceFromIterable = Source(List(1,2,3))
sourceFromIterable runForeach{ i => println(i) }
```

<div style="width: 100%; text-align: center;">
  <iframe src="https://vine.co/v/5FTYz3bqL1m/embed/simple" width="300" height="300" frameborder="0"></iframe><script src="https://platform.vine.co/static/scripts/embed.js"></script>
</div>

