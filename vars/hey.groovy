#!/usr/bin/env groovy

def call( Map map = [:], Map params) {
  echo "Params su ${params}"
  echo "Ime je ${map.ime1}, a lista ${map.lista1}"
}
