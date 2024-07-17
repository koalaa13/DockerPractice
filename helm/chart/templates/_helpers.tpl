{{- define "encodedDbUser" }}
{{- printf .Values.db.defaultUser | b64enc }}
{{- end }}

{{- define "encodedDbPassword" }}
{{- printf .Values.db.defaultPassword | b64enc }}
{{- end }}