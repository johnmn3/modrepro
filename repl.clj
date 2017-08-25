(require '[cljs.repl :as r])
(require '[cljs.build.api :as b])
(require '[cljs.repl.browser :as rb])

(def opts
  {:watch "src"
   :output-dir "out"
   :asset-path "/out"
   :optimizations :none
   :modules {:upstream {:entries '#{modrepro.core}
                        :output-to "out/upstream.js"}
             :widgets {:entries '#{submodrepro.widgets}
                       :output-to "out/widgets.js"}
             :core {:entries '#{submodrepro.core}
                    :output-to "out/core.js"}}
   :browser-repl true
   :verbose true})

(b/build "src" opts)
(r/repl* (rb/repl-env) opts)
