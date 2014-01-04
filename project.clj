(defproject parkour-exploration "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.damballa/parkour "0.5.2"
                  :exclusions [org.slf4j/slf4j-api]]
                 ;; [org.apache.hadoop/hadoop-core "1.0.3"]
                 ;; https://groups.google.com/forum/#!topic/clojure/mRiN1Oq7UqE
                 [org.codehaus.jsr166-mirror/jsr166y "1.7.0"]]
  :plugins [[lein-swank "1.4.5"]]
  :profiles {:provided {:dependencies [[org.apache.hadoop/hadoop-core "1.0.3"]]}}
  :aot [parkour-exploration.word-count])
