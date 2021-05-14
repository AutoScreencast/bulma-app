(ns bulma-app.app.core
  (:require [reagent.dom :as rdom]))

;; <div class= "field" >
;; <input id= "switchExample" type= "checkbox" name= "switchExample" class= "switch" checked= "checked" >
;; <label for= "switchExample" >Switch example</label>
;; </div>

(defn app []
  [:div.wrapper
   [:div "some text here"]
   [:div "some more text here"]
   [:div.field {:data-tooltip "Tooltip on Checkbox + Label"}
    [:input {:id "switchColorDefault"
             :class "switch"
             :name "switchColorDefault"
             :type "checkbox"
             :default-checked true}]
    [:label {:for "switchColorDefault"} "Switch example"]]
   [:div "some text here"]
   [:div "some more text here"]
   [:button.button {:data-tooltip "Tooltip Text"
                    :class "has-tooltip-arrow"} "top tooltip"]])

(defn render []
  (rdom/render [app] (.getElementById js/document "root")))

(defn ^:export main []
  (render))

(defn ^:dev/after-load reload! []
  (render))
