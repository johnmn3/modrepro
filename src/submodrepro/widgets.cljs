(ns submodrepro.widgets
  (:require
    [cljs.loader :as l]))

(defn instrument-btn []
  (let [btn (.getElementById js/document "btn")]
    (l/load :upstream
            (set! (.-onclick btn)
                  (fn []
                    ((resolve 'modrepro.core/upstream-print) "clicked"))))))

(l/set-loaded! :widgets)
