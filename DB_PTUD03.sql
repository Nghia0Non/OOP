USE [master]
GO
/****** Object:  Database [PTUD03]    Script Date: 11/10/2016 12:08:45 PM ******/
CREATE DATABASE [PTUD03]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Student', FILENAME = N'E:\SQL\Student.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Student_log', FILENAME = N'E:\SQL\Student_log.ldf' , SIZE = 3456KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [PTUD03] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PTUD03].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PTUD03] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PTUD03] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PTUD03] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PTUD03] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PTUD03] SET ARITHABORT OFF 
GO
ALTER DATABASE [PTUD03] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [PTUD03] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PTUD03] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PTUD03] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PTUD03] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PTUD03] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PTUD03] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PTUD03] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PTUD03] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PTUD03] SET  DISABLE_BROKER 
GO
ALTER DATABASE [PTUD03] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PTUD03] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PTUD03] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PTUD03] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PTUD03] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PTUD03] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PTUD03] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PTUD03] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [PTUD03] SET  MULTI_USER 
GO
ALTER DATABASE [PTUD03] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PTUD03] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PTUD03] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PTUD03] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [PTUD03] SET DELAYED_DURABILITY = DISABLED 
GO
USE [PTUD03]
GO
/****** Object:  Table [dbo].[tblChuyenNganh]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblChuyenNganh](
	[fldMaChuyenNganh] [nvarchar](10) NOT NULL,
	[fldTenChuyenNganh] [nvarchar](30) NOT NULL,
	[fldMaKhoa] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_dboChuyenNganh] PRIMARY KEY CLUSTERED 
(
	[fldMaChuyenNganh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblDiem]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDiem](
	[fldMaLop] [nvarchar](10) NOT NULL,
	[fldMaSV] [nvarchar](10) NOT NULL,
	[fldMaMH] [nvarchar](10) NOT NULL,
	[fldDiemTK] [nvarchar](10) NOT NULL,
	[fldDiemGK] [nvarchar](5) NOT NULL,
	[fldDiemCK] [nvarchar](5) NOT NULL,
	[fldDiemTB] [nvarchar](5) NOT NULL,
	[fldXepLoai] [nvarchar](10) NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblGiaoVien]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblGiaoVien](
	[fldMaGV] [nvarchar](10) NOT NULL,
	[fldTenGV] [nvarchar](50) NOT NULL,
	[fldMaChuyenNganh] [nvarchar](10) NOT NULL,
	[fldNgaySinh] [nvarchar](10) NOT NULL,
	[fldGioiTinh] [nvarchar](10) NOT NULL,
	[fldEmail] [nvarchar](50) NOT NULL,
	[fldDiaChi] [nvarchar](70) NOT NULL,
	[fldSDT] [nvarchar](15) NOT NULL,
 CONSTRAINT [PK_tblGiangVien] PRIMARY KEY CLUSTERED 
(
	[fldMaGV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblHocPhan]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblHocPhan](
	[fldMaHP] [nvarchar](10) NOT NULL,
	[fldTenHP] [nvarchar](50) NOT NULL,
	[fldMaMH] [nvarchar](10) NOT NULL,
	[fldTenKhoa] [nvarchar](50) NOT NULL,
	[fldHocPhanYeuCau] [nvarchar](20) NULL,
 CONSTRAINT [PK_tblHocPhan] PRIMARY KEY CLUSTERED 
(
	[fldMaHP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblKhoa]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblKhoa](
	[fldMaKhoa] [nvarchar](10) NOT NULL,
	[fldTenKhoa] [nvarchar](50) NOT NULL,
	[fldSDT] [nvarchar](15) NULL,
 CONSTRAINT [PK_tblKhoa] PRIMARY KEY CLUSTERED 
(
	[fldMaKhoa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblLop]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblLop](
	[fldMaLop] [nvarchar](10) NOT NULL,
	[fldTenLop] [nvarchar](50) NOT NULL,
	[fldMaChuyenNganh] [nvarchar](10) NOT NULL,
	[fldSiSo] [nvarchar](2) NOT NULL,
	[fldKhoaHoc] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_tblLop] PRIMARY KEY CLUSTERED 
(
	[fldMaLop] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblLopHP]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblLopHP](
	[fldMaLHP] [nvarchar](10) NOT NULL,
	[fldMaHP] [nvarchar](10) NOT NULL,
	[fldMaMH] [nvarchar](10) NOT NULL,
	[fldMaKhoa] [nvarchar](10) NOT NULL,
	[fldTietHoc] [nvarchar](10) NOT NULL,
	[fldPhongHoc] [nvarchar](10) NOT NULL,
	[fldThu] [nvarchar](10) NOT NULL,
	[fldSiSo] [nvarchar](10) NOT NULL,
	[fldHocKy] [nvarchar](10) NOT NULL,
	[fldNamHoc] [nvarchar](10) NOT NULL,
	[fldNgayThi] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_tblLopHP_1] PRIMARY KEY CLUSTERED 
(
	[fldMaLHP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblMonHoc]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblMonHoc](
	[fldMaMH] [nvarchar](10) NOT NULL,
	[fldTenMH] [nvarchar](30) NOT NULL,
	[fldMaChuyenNganh] [nvarchar](10) NOT NULL,
	[fldHocKy] [nvarchar](1) NOT NULL,
	[fldSoTinChi] [nvarchar](1) NOT NULL,
	[fldHinhThucThi] [nvarchar](20) NOT NULL,
	[fldBatBuoc] [nvarchar](10) NULL,
 CONSTRAINT [PK_tblMonHoc] PRIMARY KEY CLUSTERED 
(
	[fldMaMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblNguoiDung]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblNguoiDung](
	[fldTenDangNhap] [nvarchar](10) NOT NULL,
	[fldMatKhau] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_tblNguoiDung] PRIMARY KEY CLUSTERED 
(
	[fldTenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblNguoiQuanLy]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblNguoiQuanLy](
	[fldMaNQL] [nvarchar](10) NOT NULL,
	[fldTen] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_tblAdmin] PRIMARY KEY CLUSTERED 
(
	[fldMaNQL] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblPhieuDangKyDay]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblPhieuDangKyDay](
	[fldMaLHP] [nvarchar](10) NOT NULL,
	[fldMaGV] [nvarchar](10) NOT NULL,
	[fldHocKy] [nvarchar](10) NOT NULL,
	[fldNamHoc] [nvarchar](10) NOT NULL,
	[fldNgayDangKy] [nvarchar](10) NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblPhieuDangKyHoc]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblPhieuDangKyHoc](
	[fldMaLHP] [nvarchar](10) NOT NULL,
	[fldMaSV] [nvarchar](10) NOT NULL,
	[fldHocKy] [nvarchar](10) NOT NULL,
	[fldNamHoc] [nvarchar](10) NOT NULL,
	[fldNgayDangKy] [nvarchar](10) NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[tblSinhVien]    Script Date: 11/10/2016 12:08:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblSinhVien](
	[fldMaSV] [nvarchar](10) NOT NULL,
	[fldTenSV] [nvarchar](70) NOT NULL,
	[fldMaLop] [nvarchar](10) NOT NULL,
	[fldHeDaoTao] [nvarchar](50) NOT NULL,
	[fldNgaySinh] [nvarchar](10) NOT NULL,
	[fldGioiTinh] [nvarchar](10) NOT NULL,
	[fldDiaChi] [nvarchar](100) NULL,
	[fldSDT] [nvarchar](15) NULL,
 CONSTRAINT [PK_tblSinhVien] PRIMARY KEY CLUSTERED 
(
	[fldMaSV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'CNTT', N'Công Nghệ Thông Tin', N'TMDT')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'HTTT', N'Hệ Thống Thông Tin', N'TMDT')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'KDTM', N'Kinh doanh theo mạng', N'QTKD')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'KIEMTIEN', N'Kiếm tiền', N'QTKD')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'KSTT', N'Khảo sát thị trường', N'TMXD')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'KTDC', N'Kinh tế đại cương', N'TMDT')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'KTPC', N'Kỹ Thuật phần Cứng', N'CNTT')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'KTPM', N'Kỹ Thuật Phần Mềm', N'CNTT')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'KTVM', N'Kinh tế vĩ mô', N'QTKD')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'MHKT', N'Mô hình kiến trúc', N'TMXD')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'QCQM', N'Quảng cáo qua mạng', N'TMDT')
INSERT [dbo].[tblChuyenNganh] ([fldMaChuyenNganh], [fldTenChuyenNganh], [fldMaKhoa]) VALUES (N'VLXD', N'Vật liệu xây dựng', N'TMXD')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'HTTT10A', N'SV007', N'MH001', N'6', N'6.9', N'10', N'8.27', N'B')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'HTTT10A', N'SV007', N'MH002', N'5', N'6', N'10', N'7.8', N'B')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'HTTT10A', N'SV007', N'MH003', N'6.6', N'6.5', N'7.5', N'7.02', N'B')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'KTPM10A', N'SV001', N'MH001', N'4', N'4', N'4', N'4', N'D')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'HTTT10A', N'SV007', N'MH001', N'6', N'6.9', N'10', N'8.27', N'B')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'HTTT10A', N'SV007', N'MH002', N'5', N'6', N'10', N'7.8', N'B')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'HTTT10A', N'SV007', N'MH003', N'6.6', N'6.5', N'7.5', N'7.02', N'B')
INSERT [dbo].[tblDiem] ([fldMaLop], [fldMaSV], [fldMaMH], [fldDiemTK], [fldDiemGK], [fldDiemCK], [fldDiemTB], [fldXepLoai]) VALUES (N'KTPM10A', N'SV001', N'MH001', N'4', N'4', N'4', N'4', N'D')
INSERT [dbo].[tblGiaoVien] ([fldMaGV], [fldTenGV], [fldMaChuyenNganh], [fldNgaySinh], [fldGioiTinh], [fldEmail], [fldDiaChi], [fldSDT]) VALUES (N'GV001', N'Nguyễn Văn B', N'KTPM', N'12/12/1990', N'0', N'x@x.com', N'zxczxc', N'1231231231231')
INSERT [dbo].[tblGiaoVien] ([fldMaGV], [fldTenGV], [fldMaChuyenNganh], [fldNgaySinh], [fldGioiTinh], [fldEmail], [fldDiaChi], [fldSDT]) VALUES (N'GV002', N'Nguyễn Văn A', N'CNTT', N'12/12/1990', N'1', N'xxxx@xx.com', N'xxxxxx', N'123123123')
INSERT [dbo].[tblGiaoVien] ([fldMaGV], [fldTenGV], [fldMaChuyenNganh], [fldNgaySinh], [fldGioiTinh], [fldEmail], [fldDiaChi], [fldSDT]) VALUES (N'GV003', N'Nguyễn Thị Bưởi', N'CNTT', N'22/11/1955', N'0', N'buoi@gmail.com', N'123 nguyen van dau', N'1234567951')
INSERT [dbo].[tblGiaoVien] ([fldMaGV], [fldTenGV], [fldMaChuyenNganh], [fldNgaySinh], [fldGioiTinh], [fldEmail], [fldDiaChi], [fldSDT]) VALUES (N'GV123', N'1231', N'CNTT', N'08-11-2016', N'1', N'xxx@yyy.zzz', N'123123', N'123123123123')
INSERT [dbo].[tblHocPhan] ([fldMaHP], [fldTenHP], [fldMaMH], [fldTenKhoa], [fldHocPhanYeuCau]) VALUES (N'HP001', N'Lập trình Web', N'MH001', N'Công Nghệ Thông Tin', N'HP002')
INSERT [dbo].[tblHocPhan] ([fldMaHP], [fldTenHP], [fldMaMH], [fldTenKhoa], [fldHocPhanYeuCau]) VALUES (N'HP002', N'Lập Trình Java', N'MH001', N'Công Nghệ Thông Tin', N'')
INSERT [dbo].[tblHocPhan] ([fldMaHP], [fldTenHP], [fldMaMH], [fldTenKhoa], [fldHocPhanYeuCau]) VALUES (N'HP003', N'Cấu Trúc Dữ Liệu', N'MH003', N'Thương Mại Điên Tử', N'')
INSERT [dbo].[tblKhoa] ([fldMaKhoa], [fldTenKhoa], [fldSDT]) VALUES (N'CNTT', N'Công Nghệ Thông Tin', N'09191231823')
INSERT [dbo].[tblKhoa] ([fldMaKhoa], [fldTenKhoa], [fldSDT]) VALUES (N'QTKD', N'Quản Trị Kinh Doanh', N'1231123123')
INSERT [dbo].[tblKhoa] ([fldMaKhoa], [fldTenKhoa], [fldSDT]) VALUES (N'TMDT', N'Thương Mại Điên Tử', N'1111111111111')
INSERT [dbo].[tblKhoa] ([fldMaKhoa], [fldTenKhoa], [fldSDT]) VALUES (N'TMXD', N'Thương mại xây dựng', N'111111111111')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'HTTT10A', N'Hệ thống thông tin 10A', N'HTTT', N'77', N'2016-2020')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'HTTT10B', N'Hệ thống thông tin 10B', N'HTTT', N'88', N'2016-2020')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'KDTM10A', N'Kinh doanh thương mại', N'KDTM', N'88', N'2016-2020')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'KSTT10A', N'Khảo sát thị trường 10A', N'KSTT', N'88', N'2016-2020')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'KTDC10A', N'Kinh tế đại cương 10A', N'KTDC', N'99', N'2016-2020')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'KTPC11C', N'Kỹ thuật phần cứng 10C', N'KTPC', N'77', N'2017-2021')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'KTPM10A', N'Kỹ Thuật Phần Mềm 10A', N'CNTT', N'99', N'2016-2020')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'KTPM10B', N'Kỹ Thuật Phần Mềm 10B', N'CNTT', N'50', N'2016-2020')
INSERT [dbo].[tblLop] ([fldMaLop], [fldTenLop], [fldMaChuyenNganh], [fldSiSo], [fldKhoaHoc]) VALUES (N'KTVM12B', N'Kinh tế vĩ mô 12B', N'KTVM', N'55', N'2018-2022')
INSERT [dbo].[tblLopHP] ([fldMaLHP], [fldMaHP], [fldMaMH], [fldMaKhoa], [fldTietHoc], [fldPhongHoc], [fldThu], [fldSiSo], [fldHocKy], [fldNamHoc], [fldNgayThi]) VALUES (N'LHP001', N'HP001', N'MH001', N'CNTT', N'1-3', N'B1.1', N'Thứ 2', N'44', N'1', N'2016', N'15-02-2017')
INSERT [dbo].[tblLopHP] ([fldMaLHP], [fldMaHP], [fldMaMH], [fldMaKhoa], [fldTietHoc], [fldPhongHoc], [fldThu], [fldSiSo], [fldHocKy], [fldNamHoc], [fldNgayThi]) VALUES (N'LHP002', N'HP002', N'MH001', N'TMDT', N'7-8', N'B1.1', N'Thứ 2', N'55', N'1', N'2017', N'20-11-2017')
INSERT [dbo].[tblLopHP] ([fldMaLHP], [fldMaHP], [fldMaMH], [fldMaKhoa], [fldTietHoc], [fldPhongHoc], [fldThu], [fldSiSo], [fldHocKy], [fldNamHoc], [fldNgayThi]) VALUES (N'LHP003', N'HP003', N'MH003', N'CNTT', N'1-3', N'B1.2', N'Thứ 2', N'55', N'1', N'2016', N'01-11-2017')
INSERT [dbo].[tblMonHoc] ([fldMaMH], [fldTenMH], [fldMaChuyenNganh], [fldHocKy], [fldSoTinChi], [fldHinhThucThi], [fldBatBuoc]) VALUES (N'MH001', N'Phát Triển Ứng Dụng', N'HTTT', N'4', N'4', N'Thi Thực Hành', N'')
INSERT [dbo].[tblMonHoc] ([fldMaMH], [fldTenMH], [fldMaChuyenNganh], [fldHocKy], [fldSoTinChi], [fldHinhThucThi], [fldBatBuoc]) VALUES (N'MH002', N'Lập Trình Java', N'KTPM', N'4', N'4', N'Thi Thực Hành', N'Bắt Buộc')
INSERT [dbo].[tblMonHoc] ([fldMaMH], [fldTenMH], [fldMaChuyenNganh], [fldHocKy], [fldSoTinChi], [fldHinhThucThi], [fldBatBuoc]) VALUES (N'MH003', N'Nhập Môn Lập Trình C', N'KTPM', N'2', N'4', N'Thi Thực Hành', N'')
INSERT [dbo].[tblMonHoc] ([fldMaMH], [fldTenMH], [fldMaChuyenNganh], [fldHocKy], [fldSoTinChi], [fldHinhThucThi], [fldBatBuoc]) VALUES (N'MH004', N'Kiếm tiền', N'KIEMTIEN', N'2', N'2', N'Thi Thực Hành', N'Bắt Buộc')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'admin', N'111111')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'GV001', N'123456')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'GV002', N'654321')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'GV003', N'654321')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'GV123', N'654321')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'SV001', N'123456')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'SV0010', N'123456')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'SV002', N'123456')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'SV003', N'123456')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'SV004', N'123456')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'SV005', N'123456')
INSERT [dbo].[tblNguoiDung] ([fldTenDangNhap], [fldMatKhau]) VALUES (N'SV007', N'123456')
INSERT [dbo].[tblNguoiQuanLy] ([fldMaNQL], [fldTen]) VALUES (N'AD001', N'AD001')
INSERT [dbo].[tblPhieuDangKyDay] ([fldMaLHP], [fldMaGV], [fldHocKy], [fldNamHoc], [fldNgayDangKy]) VALUES (N'LHP001', N'GV001', N'1', N'2016', N'10-11-2016')
INSERT [dbo].[tblPhieuDangKyDay] ([fldMaLHP], [fldMaGV], [fldHocKy], [fldNamHoc], [fldNgayDangKy]) VALUES (N'LHP002', N'GV001', N'1', N'2017', N'10-11-2016')
INSERT [dbo].[tblPhieuDangKyDay] ([fldMaLHP], [fldMaGV], [fldHocKy], [fldNamHoc], [fldNgayDangKy]) VALUES (N'LHP003', N'GV002', N'1', N'2016', N'10-11-2016')
INSERT [dbo].[tblPhieuDangKyHoc] ([fldMaLHP], [fldMaSV], [fldHocKy], [fldNamHoc], [fldNgayDangKy]) VALUES (N'LHP001', N'SV001', N'1', N'2016', N'10-11-2016')
INSERT [dbo].[tblPhieuDangKyHoc] ([fldMaLHP], [fldMaSV], [fldHocKy], [fldNamHoc], [fldNgayDangKy]) VALUES (N'LHP002', N'SV001', N'1', N'2017', N'10-11-2016')
INSERT [dbo].[tblPhieuDangKyHoc] ([fldMaLHP], [fldMaSV], [fldHocKy], [fldNamHoc], [fldNgayDangKy]) VALUES (N'LHP001', N'SV002', N'1', N'2016', N'10-11-2016')
INSERT [dbo].[tblPhieuDangKyHoc] ([fldMaLHP], [fldMaSV], [fldHocKy], [fldNamHoc], [fldNgayDangKy]) VALUES (N'LHP002', N'SV002', N'1', N'2017', N'10-11-2016')
INSERT [dbo].[tblSinhVien] ([fldMaSV], [fldTenSV], [fldMaLop], [fldHeDaoTao], [fldNgaySinh], [fldGioiTinh], [fldDiaChi], [fldSDT]) VALUES (N'SV001', N'Nguyễn Duy Nguyên', N'KTPM10A', N'Cao Đẳng', N'16/09/1996', N'1', N'123 Nơ Trang Long', N'01663699279')
INSERT [dbo].[tblSinhVien] ([fldMaSV], [fldTenSV], [fldMaLop], [fldHeDaoTao], [fldNgaySinh], [fldGioiTinh], [fldDiaChi], [fldSDT]) VALUES (N'SV0010', N'Nguyễn Văn Nam', N'KTPM10B', N'Đại Học', N'20-11-2016', N'0', N'2222', N'2222222222')
INSERT [dbo].[tblSinhVien] ([fldMaSV], [fldTenSV], [fldMaLop], [fldHeDaoTao], [fldNgaySinh], [fldGioiTinh], [fldDiaChi], [fldSDT]) VALUES (N'SV002', N'Nguyễn Lương Thủy Diệu', N'KTPM10A', N'Đại Học', N'17-11-2016', N'0', N'Bình Quới', N'123123123123')
INSERT [dbo].[tblSinhVien] ([fldMaSV], [fldTenSV], [fldMaLop], [fldHeDaoTao], [fldNgaySinh], [fldGioiTinh], [fldDiaChi], [fldSDT]) VALUES (N'SV003', N'Nguyễn Văn A', N'KTPM10A', N'Đại Học', N'10-11-2016', N'1', N'Gia Định', N'123123123123')
INSERT [dbo].[tblSinhVien] ([fldMaSV], [fldTenSV], [fldMaLop], [fldHeDaoTao], [fldNgaySinh], [fldGioiTinh], [fldDiaChi], [fldSDT]) VALUES (N'SV004', N'Nguyễn Thị Kiều My', N'KTPM10A', N'Đại Học', N'27-11-2016', N'0', N'132', N'112121211')
INSERT [dbo].[tblSinhVien] ([fldMaSV], [fldTenSV], [fldMaLop], [fldHeDaoTao], [fldNgaySinh], [fldGioiTinh], [fldDiaChi], [fldSDT]) VALUES (N'SV005', N'Võ Văn Nam', N'KTDC10A', N'Đại Học', N'13-11-1997', N'1', N'123123123', N'0211541215')
INSERT [dbo].[tblSinhVien] ([fldMaSV], [fldTenSV], [fldMaLop], [fldHeDaoTao], [fldNgaySinh], [fldGioiTinh], [fldDiaChi], [fldSDT]) VALUES (N'SV007', N'Hồ Cẩm Hào', N'HTTT10A', N'Đại Học', N'14-11-1996', N'1', N'321', N'012312312312')
ALTER TABLE [dbo].[tblChuyenNganh]  WITH CHECK ADD  CONSTRAINT [FK_tblChuyenNganh_tblKhoa] FOREIGN KEY([fldMaKhoa])
REFERENCES [dbo].[tblKhoa] ([fldMaKhoa])
GO
ALTER TABLE [dbo].[tblChuyenNganh] CHECK CONSTRAINT [FK_tblChuyenNganh_tblKhoa]
GO
ALTER TABLE [dbo].[tblDiem]  WITH CHECK ADD  CONSTRAINT [FK_tblDiem_tblSinhVien] FOREIGN KEY([fldMaSV])
REFERENCES [dbo].[tblSinhVien] ([fldMaSV])
GO
ALTER TABLE [dbo].[tblDiem] CHECK CONSTRAINT [FK_tblDiem_tblSinhVien]
GO
ALTER TABLE [dbo].[tblHocPhan]  WITH CHECK ADD  CONSTRAINT [FK_tblHocPhan_tblMonHoc] FOREIGN KEY([fldMaMH])
REFERENCES [dbo].[tblMonHoc] ([fldMaMH])
GO
ALTER TABLE [dbo].[tblHocPhan] CHECK CONSTRAINT [FK_tblHocPhan_tblMonHoc]
GO
ALTER TABLE [dbo].[tblLop]  WITH CHECK ADD  CONSTRAINT [FK_tblLop_tblChuyenNganh1] FOREIGN KEY([fldMaChuyenNganh])
REFERENCES [dbo].[tblChuyenNganh] ([fldMaChuyenNganh])
GO
ALTER TABLE [dbo].[tblLop] CHECK CONSTRAINT [FK_tblLop_tblChuyenNganh1]
GO
ALTER TABLE [dbo].[tblLopHP]  WITH CHECK ADD  CONSTRAINT [FK_tblLopHP_tblHocPhan] FOREIGN KEY([fldMaHP])
REFERENCES [dbo].[tblHocPhan] ([fldMaHP])
GO
ALTER TABLE [dbo].[tblLopHP] CHECK CONSTRAINT [FK_tblLopHP_tblHocPhan]
GO
ALTER TABLE [dbo].[tblSinhVien]  WITH CHECK ADD  CONSTRAINT [FK_tblSinhVien_tblLop1] FOREIGN KEY([fldMaLop])
REFERENCES [dbo].[tblLop] ([fldMaLop])
GO
ALTER TABLE [dbo].[tblSinhVien] CHECK CONSTRAINT [FK_tblSinhVien_tblLop1]
GO
USE [master]
GO
ALTER DATABASE [PTUD03] SET  READ_WRITE 
GO
