#!/usr/bin/env groovy

def call( Map map = [:], Map params = [:], String nesto = "") {
  echo "Params su ${params}"
  echo "Ime je ${map.ime1}, a lista ${map.lista1}, a jos ${nesto}"
}
