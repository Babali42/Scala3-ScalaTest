package kata;

def identity[A](x: A): A = x

@main def hello() = println(
  "Identity of 1 is " + identity(1) + " and identity of toto is " + identity(
    "toto"
  )
);
