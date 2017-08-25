# modrepro

In a terminal, run the following lines:

`git clone https://github.com/johnmn3/modrepro.git`

`cd modrepro`

Download the cljs.jar from here: https://github.com/clojure/clojurescript/releases/download/r1.9.908/cljs.jar

And place it in the current directory (modrepro).

Then run the following:

`rlwrap java -cp cljs.jar:src clojure.main repl.clj`

Open a browser at http://localhost:9000/

Open the developer console.

You should see the error:

```
core.cljs:6 Uncaught TypeError: Cannot read property 'instrument_btn' of undefined
    at core.cljs:6
(anonymous) @ core.cljs:6
```
