### GitHub Stats

<p align="left"><img src="https://raw.githubusercontent.com/smakhtin/smakhtin/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 📫 How to reach me:
  - Website   : <https://smakhtin.cc>
  - X   : <https://x.com/vadim_smakhtin>
  - LinkedIn   : <https://www.linkedin.com/in/vadimsmakhtin/>
  - Instagram    : <https://www.instagram.com/smakhtin>
