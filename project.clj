(defproject snowball2 "2.0.0"

  ; GENERAL OPTIONS

  :description "Repackaged Snowball 2 stemmer"
  :url "https://github.com/mtruyens/snowball2"
  :license {:name "BSD 3-clause"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  ;; Options used by Java
  ;;; run with assertions enabled

  :java-source-paths ["src"]
  :omit-source true
  :aot :all  
  )