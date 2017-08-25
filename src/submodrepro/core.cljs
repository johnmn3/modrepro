(ns submodrepro.core
  (:require
    [cljs.loader :as l]))

(l/load :widgets
        ((resolve 'submodrepro.widgets/instrument-btn)))

(l/set-loaded! :core)
