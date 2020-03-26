#!/usr/bin/env groovy

def call( Map map = [:], Map params = [:], String nesto = "") {
  echo "Params su ${params}"
  echo "imena: ${map.ime1} i ${map.ime2}, a jos ${nesto}"
  map.someList.each {
    echo "hej"
  }
  map.someList = map.someList ? map.someList : []
  if (map.someList.isEmpty())
    echo "Lista: ${map.someList}"
  else echo "Null je"
  
}
