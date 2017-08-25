(require '[cljs.build.api :as b])

(b/build "src"
  {:output-dir "out"
   :asset-path "/out"
   :optimizations :advanced
   :modules {:upstream {:entries '#{modrepro.core}
                        :output-to "out/upstream.js"}
             :widgets {:entries '#{submodrepro.widgets}
                       :output-to "out/widgets.js"
                       :depends-on [:upstream]}
             :core {:entries '#{submodrepro.core}
                    :output-to "out/core.js"
                    :depends-on [:widgets]}}})

(System/exit 0)
